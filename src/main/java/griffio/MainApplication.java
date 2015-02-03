package griffio;

import com.google.common.base.Optional;
import griffio.rest.GitHubRestClient;
import griffio.rest.GitHubUser;

public class MainApplication {

    public static void main(String[] args) {

        String username = args.length != 0 ? args[0] : "griffio";

        GitHubUser user = new GitHubRestClient().getGitHubApiService().user(username);

        System.out.println(user);

    }

}
