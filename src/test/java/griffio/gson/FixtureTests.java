package griffio.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import griffio.rest.GitHubRepository;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FixtureTests {

    @Test
    public void deserialise() throws IOException {

        String repoJson = JsonResource.fixture("github-repository.json");

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(GitHubRepository.class, new RepositoryJsonDeserializer())
                .create();

        GitHubRepository repository = gson.fromJson(repoJson, GitHubRepository.class);

        Assert.assertNotNull(repository);

    }

}
