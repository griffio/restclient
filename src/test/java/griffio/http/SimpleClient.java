package griffio.http;

import griffio.rest.GitHubRestClient;
import griffio.rest.GitHubUser;
import org.junit.Assert;
import org.junit.Test;

public class SimpleClient {

    @Test
    public void fetch_user_from_github_api() throws Exception {
        GitHubRestClient gitHubRestClient = new GitHubRestClient();
        GitHubUser griffio = gitHubRestClient.getGitHubApiService().user("griffio");
        Assert.assertEquals("griffio", griffio.name());
    }

}
