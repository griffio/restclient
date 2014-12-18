package griffio.rest;

import retrofit.http.GET;
import retrofit.http.Path;

import java.util.List;

public interface GitHubApiService {

    @GET("/users/{user}/repos")
    List<GitHubRepository> repositories(@Path("user") String user);

}
