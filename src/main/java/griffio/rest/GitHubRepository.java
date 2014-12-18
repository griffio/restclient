package griffio.rest;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class GitHubRepository {

    GitHubRepository() {
    }

    public abstract String avatarUrl();

    public abstract String email();

    public abstract Boolean hireable();

    public abstract Long id();

    public abstract String name();

    public static GitHubRepository create(String avatarUrl, String email, Boolean hireable, Long id, String name) {
        return new AutoValue_GitHubRepository(avatarUrl, email, hireable, id, name);
    }
}
