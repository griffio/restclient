package griffio.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import griffio.rest.GitHubUser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FixtureTests {

    @Test
    public void deserialize() throws IOException {

        String repoJson = JsonResource.fixture("github-repository.json");

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(GitHubUser.class, new GitHubUserJsonDeserializer())
                .create();

        GitHubUser repository = gson.fromJson(repoJson, GitHubUser.class);

        Assert.assertNotNull(repository);

    }

}
