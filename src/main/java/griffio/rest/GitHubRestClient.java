package griffio.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import griffio.gson.GitHubUserJsonDeserializer;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;

public class GitHubRestClient {

  private final GitHubApiService gitHubApiService;

  public GitHubRestClient() {

    final Interceptor acceptIntercept = new Interceptor() {
      @Override
      public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder().header("Accept", "application/vnd.github.v3+json").build();
        return chain.proceed(request);
      }
    };

    Gson gson = new GsonBuilder()
        .registerTypeAdapter(GitHubUser.class, new GitHubUserJsonDeserializer())
        .create();

    OkHttpClient client = new OkHttpClient().newBuilder()
        .addInterceptor(acceptIntercept).build();

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
