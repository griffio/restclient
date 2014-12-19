package griffio.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import griffio.gson.GitHubUserJsonDeserializer;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

public class GitHubRestClient {

    private final GitHubApiService gitHubApiService;

    public GitHubRestClient() {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(GitHubUser.class, new GitHubUserJsonDeserializer())
                .create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.github.com")
                .setConverter(new GsonConverter(gson))
                .build();

        gitHubApiService = restAdapter.create(GitHubApiService.class);
    }

    public GitHubApiService getGitHubApiService() {
        return gitHubApiService;
    }
}
