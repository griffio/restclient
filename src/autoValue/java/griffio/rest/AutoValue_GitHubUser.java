
package griffio.rest;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GitHubUser extends GitHubUser {

  private final String avatarUrl;
  private final String email;
  private final Boolean hireable;
  private final Long id;
  private final String name;

  AutoValue_GitHubUser(
          String avatarUrl,
          String email,
          Boolean hireable,
          Long id,
          String name) {
    if (avatarUrl == null) {
      throw new NullPointerException("Null avatarUrl");
    }
    this.avatarUrl = avatarUrl;
    if (email == null) {
      throw new NullPointerException("Null email");
    }
    this.email = email;
    if (hireable == null) {
      throw new NullPointerException("Null hireable");
    }
    this.hireable = hireable;
    if (id == null) {
      throw new NullPointerException("Null id");
    }
    this.id = id;
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
  }

  @Override
  public String avatarUrl() {
    return avatarUrl;
  }

  @Override
  public String email() {
    return email;
  }

  @Override
  public Boolean hireable() {
    return hireable;
  }

  @Override
  public Long id() {
    return id;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "GitHubRepository{"
        + "avatarUrl=" + avatarUrl + ", "
        + "email=" + email + ", "
        + "hireable=" + hireable + ", "
        + "id=" + id + ", "
        + "name=" + name
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GitHubUser) {
      GitHubUser that = (GitHubUser) o;
      return (this.avatarUrl.equals(that.avatarUrl()))
           && (this.email.equals(that.email()))
           && (this.hireable.equals(that.hireable()))
           && (this.id.equals(that.id()))
           && (this.name.equals(that.name()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= avatarUrl.hashCode();
    h *= 1000003;
    h ^= email.hashCode();
    h *= 1000003;
    h ^= hireable.hashCode();
    h *= 1000003;
    h ^= id.hashCode();
    h *= 1000003;
    h ^= name.hashCode();
    return h;
  }

}
