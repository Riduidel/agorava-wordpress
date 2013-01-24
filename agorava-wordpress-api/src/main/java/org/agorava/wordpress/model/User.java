
package org.agorava.wordpress.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "ID",
    "display_name",
    "username",
    "email",
    "primary_blog",
    "avatar_URL",
    "profile_URL",
    "verified",
    "meta"
})
public class User {

    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("username")
    private String username;
    @JsonProperty("email")
    private String email;
    @JsonProperty("primary_blog")
    private Integer primaryBlog;
    @JsonProperty("avatar_URL")
    private String avatarURL;
    @JsonProperty("profile_URL")
    private String profileURL;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("meta")
    private Meta meta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ID")
    public Integer getID() {
        return ID;
    }

    @JsonProperty("ID")
    public void setID(Integer ID) {
        this.ID = ID;
    }

    public User withID(Integer ID) {
        this.ID = ID;
        return this;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public User withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public User withUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("primary_blog")
    public Integer getPrimaryBlog() {
        return primaryBlog;
    }

    @JsonProperty("primary_blog")
    public void setPrimaryBlog(Integer primaryBlog) {
        this.primaryBlog = primaryBlog;
    }

    public User withPrimaryBlog(Integer primaryBlog) {
        this.primaryBlog = primaryBlog;
        return this;
    }

    @JsonProperty("avatar_URL")
    public String getAvatarURL() {
        return avatarURL;
    }

    @JsonProperty("avatar_URL")
    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public User withAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
        return this;
    }

    @JsonProperty("profile_URL")
    public String getProfileURL() {
        return profileURL;
    }

    @JsonProperty("profile_URL")
    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public User withProfileURL(String profileURL) {
        this.profileURL = profileURL;
        return this;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public User withVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public User withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
