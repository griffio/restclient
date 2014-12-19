package griffio.rest;

import retrofit.http.GET;
import retrofit.http.Path;

public interface GitHubApiService {

    @GET("/users/{username}")
    GitHubUser user(@Path("username") String username);
    
}
