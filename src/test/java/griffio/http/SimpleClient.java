package griffio.http;

import com.squareup.okhttp.*;
import griffio.rest.GitHubRestClient;
import griffio.rest.GitHubUser;
import org.junit.Assert;
import org.junit.Test;
import retrofit.Call;

import java.io.IOException;

public class SimpleClient {

  @Test
  public void accept_language_interceptor_is_es() throws IOException {

    final String expected = "fr";

    final Interceptor acceptLanguage = new Interceptor() {
      @Override
      public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder().header("Accept-Language", expected).build();
        return chain.proceed(request);
      }
    };

    OkHttpClient client = new OkHttpClient();
    client.interceptors().add(acceptLanguage);

    Request request = new Request.Builder()
        .url("http://www.w3.org/2004/11/sptour-pressrelease")
        .build();

    Response response = client.newCall(request).execute();

    String contentLanguage = response.header("Content-Language");

    Assert.assertEquals("requested language", expected, contentLanguage);

  }

  @Test
  public void fetch_user_from_github_api() throws Exception {
    GitHubRestClient gitHubRestClient = new GitHubRestClient();
    Call<GitHubUser> griffio = gitHubRestClient.getGitHubApiService().user("griffio");
    Assert.assertEquals("griffio", griffio.execute().body().name());
  }

}
