
package org.agorava.wordpress.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "found",
    "posts"
})
public class PostList {

    @JsonProperty("found")
    private Integer found;
    @JsonProperty("posts")
    private List<PostReference> posts = new ArrayList<PostReference>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("found")
    public Integer getFound() {
        return found;
    }

    @JsonProperty("found")
    public void setFound(Integer found) {
        this.found = found;
    }

    public PostList withFound(Integer found) {
        this.found = found;
        return this;
    }

    @JsonProperty("posts")
    public List<PostReference> getPosts() {
        return posts;
    }

    @JsonProperty("posts")
    public void setPosts(List<PostReference> posts) {
        this.posts = posts;
    }

    public PostList withPosts(List<PostReference> posts) {
        this.posts = posts;
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
