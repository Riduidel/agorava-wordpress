
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
    "14153"
})
public class Attachments {

    @JsonProperty("14153")
    private org.agorava.wordpress.model._14153 _14153;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("14153")
    public org.agorava.wordpress.model._14153 get14153() {
        return _14153;
    }

    @JsonProperty("14153")
    public void set14153(org.agorava.wordpress.model._14153 _14153) {
        this._14153 = _14153;
    }

    public Attachments with14153(org.agorava.wordpress.model._14153 _14153) {
        this._14153 = _14153;
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
