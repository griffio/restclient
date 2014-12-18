package griffio.rest;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

public class GitHubRestClient {

    private final GitHubApiService gitHubApiService;

    public GitHubRestClient() {

        Gson camelCaseGson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.github.com")
                .setConverter(new GsonConverter(camelCaseGson))
                .build();

        gitHubApiService = restAdapter.create(GitHubApiService.class);
    }

    public GitHubApiService getGitHubApiService() {
        return gitHubApiService;
    }
}
