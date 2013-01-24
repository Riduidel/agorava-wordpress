
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
    "method_id_matches_query_id",
    "method_id",
    "id",
    "default_string",
    "default_int",
    "boolean_whitelist_defaults_to_false",
    "boolean_whitelist_defaults_to_true",
    "string_whitelist_defaults_to_foo",
    "url",
    "datetime"
})
public class TestGet {

    @JsonProperty("method_id_matches_query_id")
    private Boolean methodIdMatchesQueryId;
    @JsonProperty("method_id")
    private Integer methodId;
    @JsonProperty("id")
    private Object id;
    @JsonProperty("default_string")
    private String defaultString;
    @JsonProperty("default_int")
    private Integer defaultInt;
    @JsonProperty("boolean_whitelist_defaults_to_false")
    private Boolean booleanWhitelistDefaultsToFalse;
    @JsonProperty("boolean_whitelist_defaults_to_true")
    private Boolean booleanWhitelistDefaultsToTrue;
    @JsonProperty("string_whitelist_defaults_to_foo")
    private String stringWhitelistDefaultsToFoo;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("datetime")
    private String datetime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("method_id_matches_query_id")
    public Boolean getMethodIdMatchesQueryId() {
        return methodIdMatchesQueryId;
    }

    @JsonProperty("method_id_matches_query_id")
    public void setMethodIdMatchesQueryId(Boolean methodIdMatchesQueryId) {
        this.methodIdMatchesQueryId = methodIdMatchesQueryId;
    }

    public TestGet withMethodIdMatchesQueryId(Boolean methodIdMatchesQueryId) {
        this.methodIdMatchesQueryId = methodIdMatchesQueryId;
        return this;
    }

    @JsonProperty("method_id")
    public Integer getMethodId() {
        return methodId;
    }

    @JsonProperty("method_id")
    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    public TestGet withMethodId(Integer methodId) {
        this.methodId = methodId;
        return this;
    }

    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public TestGet withId(Object id) {
        this.id = id;
        return this;
    }

    @JsonProperty("default_string")
    public String getDefaultString() {
        return defaultString;
    }

    @JsonProperty("default_string")
    public void setDefaultString(String defaultString) {
        this.defaultString = defaultString;
    }

    public TestGet withDefaultString(String defaultString) {
        this.defaultString = defaultString;
        return this;
    }

    @JsonProperty("default_int")
    public Integer getDefaultInt() {
        return defaultInt;
    }

    @JsonProperty("default_int")
    public void setDefaultInt(Integer defaultInt) {
        this.defaultInt = defaultInt;
    }

    public TestGet withDefaultInt(Integer defaultInt) {
        this.defaultInt = defaultInt;
        return this;
    }

    @JsonProperty("boolean_whitelist_defaults_to_false")
    public Boolean getBooleanWhitelistDefaultsToFalse() {
        return booleanWhitelistDefaultsToFalse;
    }

    @JsonProperty("boolean_whitelist_defaults_to_false")
    public void setBooleanWhitelistDefaultsToFalse(Boolean booleanWhitelistDefaultsToFalse) {
        this.booleanWhitelistDefaultsToFalse = booleanWhitelistDefaultsToFalse;
    }

    public TestGet withBooleanWhitelistDefaultsToFalse(Boolean booleanWhitelistDefaultsToFalse) {
        this.booleanWhitelistDefaultsToFalse = booleanWhitelistDefaultsToFalse;
        return this;
    }

    @JsonProperty("boolean_whitelist_defaults_to_true")
    public Boolean getBooleanWhitelistDefaultsToTrue() {
        return booleanWhitelistDefaultsToTrue;
    }

    @JsonProperty("boolean_whitelist_defaults_to_true")
    public void setBooleanWhitelistDefaultsToTrue(Boolean booleanWhitelistDefaultsToTrue) {
        this.booleanWhitelistDefaultsToTrue = booleanWhitelistDefaultsToTrue;
    }

    public TestGet withBooleanWhitelistDefaultsToTrue(Boolean booleanWhitelistDefaultsToTrue) {
        this.booleanWhitelistDefaultsToTrue = booleanWhitelistDefaultsToTrue;
        return this;
    }

    @JsonProperty("string_whitelist_defaults_to_foo")
    public String getStringWhitelistDefaultsToFoo() {
        return stringWhitelistDefaultsToFoo;
    }

    @JsonProperty("string_whitelist_defaults_to_foo")
    public void setStringWhitelistDefaultsToFoo(String stringWhitelistDefaultsToFoo) {
        this.stringWhitelistDefaultsToFoo = stringWhitelistDefaultsToFoo;
    }

    public TestGet withStringWhitelistDefaultsToFoo(String stringWhitelistDefaultsToFoo) {
        this.stringWhitelistDefaultsToFoo = stringWhitelistDefaultsToFoo;
        return this;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    public TestGet withUrl(Object url) {
        this.url = url;
        return this;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public TestGet withDatetime(String datetime) {
        this.datetime = datetime;
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
