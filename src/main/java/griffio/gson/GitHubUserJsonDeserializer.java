package griffio.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import griffio.rest.GitHubUser;

import java.lang.reflect.Type;
/**
 * "avatar_url": "https://avatars.githubusercontent.com/u/346896?v=3",
 * "bio": null,
 * "blog": "",
 * "company": "",
 * "created_at": "2010-07-28T12:30:07Z",
 * "email": "griffio@fake.domain",
 * "events_url": "https://api.github.com/users/griffio/events{/privacy}",
 * "followers": 0,
 * "followers_url": "https://api.github.com/users/griffio/followers",
 * "following": 0,
 * "following_url": "https://api.github.com/users/griffio/following{/other_user}",
 * "gists_url": "https://api.github.com/users/griffio/gists{/gist_id}",
 * "gravatar_id": "",
 * "hireable": true,
 * "html_url": "https://github.com/griffio",
 * "id": 346896,
 * "location": "",
 * "login": "griffio",
 * "name": "griffio",
 * "organizations_url": "https://api.github.com/users/griffio/orgs",
 * "public_gists": 1,
 * "public_repos": 20,
 * "received_events_url": "https://api.github.com/users/griffio/received_events",
 * "repos_url": "https://api.github.com/users/griffio/repos",
 * "site_admin": false,
 * "starred_url": "https://api.github.com/users/griffio/starred{/owner}{/repo}",
 * "subscriptions_url": "https://api.github.com/users/griffio/subscriptions",
 * "type": "User",
 * "updated_at": "2014-12-18T18:29:53Z",
 * "url": "https://api.github.com/users/griffio"
 */
public class GitHubUserJsonDeserializer implements JsonDeserializer<GitHubUser> {

    @Override
    public GitHubUser deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();
        return GitHubUser.create(
                obj.get("avatar_url").getAsString(),
                obj.get("email").getAsString(),
                obj.get("hireable").getAsBoolean(),
                obj.get("id").getAsLong(),
                obj.get("name").getAsString());
    }
}
