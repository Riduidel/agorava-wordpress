
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
    "post",
    "author",
    "date",
    "URL",
    "short_URL",
    "content",
    "status",
    "parent",
    "type",
    "meta"
})
public class Comment {

    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("post")
    private PostReference post;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("date")
    private String date;
    @JsonProperty("URL")
    private String URL;
    @JsonProperty("short_URL")
    private String shortURL;
    @JsonProperty("content")
    private String content;
    @JsonProperty("status")
    private String status;
    @JsonProperty("parent")
    private Parent parent;
    @JsonProperty("type")
    private String type;
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

    public Comment withID(Integer ID) {
        this.ID = ID;
        return this;
    }

    @JsonProperty("post")
    public PostReference getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(PostReference post) {
        this.post = post;
    }

    public Comment withPost(PostReference post) {
        this.post = post;
        return this;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    public Comment withAuthor(Author author) {
        this.author = author;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Comment withDate(String date) {
        this.date = date;
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

    public Comment withURL(String URL) {
        this.URL = URL;
        return this;
    }

    @JsonProperty("short_URL")
    public String getShortURL() {
        return shortURL;
    }

    @JsonProperty("short_URL")
    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    public Comment withShortURL(String shortURL) {
        this.shortURL = shortURL;
        return this;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public Comment withContent(String content) {
        this.content = content;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Comment withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("parent")
    public Parent getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Comment withParent(Parent parent) {
        this.parent = parent;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Comment withType(String type) {
        this.type = type;
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

    public Comment withMeta(Meta meta) {
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
