
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
    "email",
    "name",
    "URL",
    "avatar_URL",
    "profile_URL"
})
public class Author {

    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("email")
    private Boolean email;
    @JsonProperty("name")
    private String name;
    @JsonProperty("URL")
    private String URL;
    @JsonProperty("avatar_URL")
    private String avatarURL;
    @JsonProperty("profile_URL")
    private String profileURL;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ID")
    public Integer getID() {
        return ID;
    }

    @JsonProperty("ID")
    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Author withID(Integer ID) {
        this.ID = ID;
        return this;
    }

    @JsonProperty("email")
    public Boolean getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Boolean email) {
        this.email = email;
    }

    public Author withEmail(Boolean email) {
        this.email = email;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Author withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("URL")
    public String getURL() {
        return URL;
    }

    @JsonProperty("URL")
    public void setURL(String URL) {
        this.URL = URL;
    }

    public Author withURL(String URL) {
        this.URL = URL;
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

    public Author withAvatarURL(String avatarURL) {
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

    public Author withProfileURL(String profileURL) {
        this.profileURL = profileURL;
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
