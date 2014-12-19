package griffio.rest;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class GitHubUser {

    GitHubUser() {
    }

    public abstract String avatarUrl();

    public abstract String email();

    public abstract Boolean hireable();

    public abstract Long id();

    public abstract String name();

    public static GitHubUser create(String avatarUrl, String email, Boolean hireable, Long id, String name) {
        return new AutoValue_GitHubUser(avatarUrl, email, hireable, id, name);
    }
}
