package griffio.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import griffio.gson.GitHubUserJsonDeserializer;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

import java.io.IOException;

public class GitHubRestClient {

    private final GitHubApiService gitHubApiService;

    public GitHubRestClient() {

        final Interceptor acceptIntercept = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {

                Request request = chain.request();

                request.headers().newBuilder()
                        .add("Accept", "application/vnd.github.v3+json")
                        .build();

                return chain.proceed(request);
            }
        };

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(GitHubUser.class, new GitHubUserJsonDeserializer())
                .create();

        OkHttpClient client = new OkHttpClient();
        client.interceptors().add(acceptIntercept);

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.github.com")
                .client(client)
                .build();

        gitHubApiService = retrofit.create(GitHubApiService.class);
    }

    public GitHubApiService getGitHubApiService() {
        return gitHubApiService;
    }
}
