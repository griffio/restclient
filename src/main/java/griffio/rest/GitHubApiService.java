package griffio.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubApiService {

    @GET("/users/{username}")
    Call<GitHubUser> user(@Path("username") String username);
}
