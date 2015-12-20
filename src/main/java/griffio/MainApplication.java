package griffio;

import griffio.rest.GitHubApiService;
import griffio.rest.GitHubRestClient;
import griffio.rest.GitHubUser;
import retrofit.Call;

import java.io.IOException;

public class MainApplication {

  public static void main(String[] args) throws IOException {
    String username = args.length != 0 ? args[0] : "griffio";
    GitHubApiService api = new GitHubRestClient().getGitHubApiService();
    Call<GitHubUser> user = api.user(username);
    System.out.println(user.execute().body().name()); //synchronous
  }
}
