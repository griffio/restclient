package griffio.rest;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

public interface GitHubApiService {

    @GET("/users/{username}")
    Call<GitHubUser> user(@Path("username") String username);
    
}
