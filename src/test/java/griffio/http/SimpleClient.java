package griffio.http;

import griffio.rest.GitHubRestClient;
import griffio.rest.GitHubUser;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import org.junit.Assert;
import org.junit.Test;

public class SimpleClient {

  @Test
  public void accept_language_interceptor_request() throws IOException {

    final String expected = "fr";

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
        .url("http://www.w3.org/2004/11/sptour-pressrelease")
        .header("Accept-Language", expected)
        .build();

    Response response = client.newCall(request).execute();

    String contentLanguage = response.header("Content-Language");

    Assert.assertEquals("requested language", expected, contentLanguage);
  }

  @Test
  public void fetch_user_from_github_api() throws Exception {
    GitHubRestClient gitHubRestClient = new GitHubRestClient();
    Call<GitHubUser> griffio = gitHubRestClient.getGitHubApiService().user("griffio");
    Assert.assertEquals("griffio", griffio.execute().body().login());
  }
}