
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
    "ID",
    "author",
    "date",
    "modified",
    "title",
    "URL",
    "short_URL",
    "content",
    "excerpt",
    "slug",
    "status",
    "password",
    "parent",
    "type",
    "comments_open",
    "pings_open",
    "comment_count",
    "like_count",
    "featured_image",
    "format",
    "geo",
    "publicize_URLs",
    "tags",
    "categories",
    "attachments",
    "meta"
})
public class Post {

    @JsonProperty("ID")
    private Integer ID;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("date")
    private String date;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("title")
    private String title;
    @JsonProperty("URL")
    private String URL;
    @JsonProperty("short_URL")
    private String shortURL;
    @JsonProperty("content")
    private String content;
    @JsonProperty("excerpt")
    private String excerpt;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("status")
    private String status;
    @JsonProperty("password")
    private String password;
    @JsonProperty("parent")
    private Boolean parent;
    @JsonProperty("type")
    private String type;
    @JsonProperty("comments_open")
    private Boolean commentsOpen;
    @JsonProperty("pings_open")
    private Boolean pingsOpen;
    @JsonProperty("comment_count")
    private Integer commentCount;
    @JsonProperty("like_count")
    private Integer likeCount;
    @JsonProperty("featured_image")
    private String featuredImage;
    @JsonProperty("format")
    private String format;
    @JsonProperty("geo")
    private Boolean geo;
    @JsonProperty("publicize_URLs")
    private List<Object> publicizeURLs = new ArrayList<Object>();
    @JsonProperty("tags")
    private Tags tags;
    @JsonProperty("categories")
    private Categories categories;
    @JsonProperty("attachments")
    private Attachments attachments;
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

    public Post withID(Integer ID) {
        this.ID = ID;
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

    public Post withAuthor(Author author) {
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

    public Post withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    public Post withModified(String modified) {
        this.modified = modified;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Post withTitle(String title) {
        this.title = title;
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

    public Post withURL(String URL) {
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

    public Post withShortURL(String shortURL) {
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

    public Post withContent(String content) {
        this.content = content;
        return this;
    }

    @JsonProperty("excerpt")
    public String getExcerpt() {
        return excerpt;
    }

    @JsonProperty("excerpt")
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Post withExcerpt(String excerpt) {
        this.excerpt = excerpt;
        return this;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Post withSlug(String slug) {
        this.slug = slug;
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

    public Post withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public Post withPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("parent")
    public Boolean getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Boolean parent) {
        this.parent = parent;
    }

    public Post withParent(Boolean parent) {
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

    public Post withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("comments_open")
    public Boolean getCommentsOpen() {
        return commentsOpen;
    }

    @JsonProperty("comments_open")
    public void setCommentsOpen(Boolean commentsOpen) {
        this.commentsOpen = commentsOpen;
    }

    public Post withCommentsOpen(Boolean commentsOpen) {
        this.commentsOpen = commentsOpen;
        return this;
    }

    @JsonProperty("pings_open")
    public Boolean getPingsOpen() {
        return pingsOpen;
    }

    @JsonProperty("pings_open")
    public void setPingsOpen(Boolean pingsOpen) {
        this.pingsOpen = pingsOpen;
    }

    public Post withPingsOpen(Boolean pingsOpen) {
        this.pingsOpen = pingsOpen;
        return this;
    }

    @JsonProperty("comment_count")
    public Integer getCommentCount() {
        return commentCount;
    }

    @JsonProperty("comment_count")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Post withCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    @JsonProperty("like_count")
    public Integer getLikeCount() {
        return likeCount;
    }

    @JsonProperty("like_count")
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Post withLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
        return this;
    }

    @JsonProperty("featured_image")
    public String getFeaturedImage() {
        return featuredImage;
    }

    @JsonProperty("featured_image")
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public Post withFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
        return this;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public Post withFormat(String format) {
        this.format = format;
        return this;
    }

    @JsonProperty("geo")
    public Boolean getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Boolean geo) {
        this.geo = geo;
    }

    public Post withGeo(Boolean geo) {
        this.geo = geo;
        return this;
    }

    @JsonProperty("publicize_URLs")
    public List<Object> getPublicizeURLs() {
        return publicizeURLs;
    }

    @JsonProperty("publicize_URLs")
    public void setPublicizeURLs(List<Object> publicizeURLs) {
        this.publicizeURLs = publicizeURLs;
    }

    public Post withPublicizeURLs(List<Object> publicizeURLs) {
        this.publicizeURLs = publicizeURLs;
        return this;
    }

    @JsonProperty("tags")
    public Tags getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Post withTags(Tags tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("categories")
    public Categories getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Post withCategories(Categories categories) {
        this.categories = categories;
        return this;
    }

    @JsonProperty("attachments")
    public Attachments getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    public Post withAttachments(Attachments attachments) {
        this.attachments = attachments;
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

    public Post withMeta(Meta meta) {
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
