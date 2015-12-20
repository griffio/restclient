package griffio;

import griffio.rest.GitHubRestClient;
import griffio.rest.GitHubUser;
import retrofit.Call;

public class MainApplication {

    public static void main(String[] args) {

        String username = args.length != 0 ? args[0] : "griffio";

        Call<GitHubUser> user = new GitHubRestClient().getGitHubApiService().user(username);

        System.out.println(user);

    }

}
