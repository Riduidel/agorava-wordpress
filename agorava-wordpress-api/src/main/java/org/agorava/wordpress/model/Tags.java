
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
    "Freshly Pressed",
    "Inspiration",
    "Recommended Reading"
})
public class Tags {

    @JsonProperty("Freshly Pressed")
    private org.agorava.wordpress.model.FreshlyPressed FreshlyPressed;
    @JsonProperty("Inspiration")
    private org.agorava.wordpress.model.Inspiration Inspiration;
    @JsonProperty("Recommended Reading")
    private org.agorava.wordpress.model.RecommendedReading RecommendedReading;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Freshly Pressed")
    public org.agorava.wordpress.model.FreshlyPressed getFreshlyPressed() {
        return FreshlyPressed;
    }

    @JsonProperty("Freshly Pressed")
    public void setFreshlyPressed(org.agorava.wordpress.model.FreshlyPressed FreshlyPressed) {
        this.FreshlyPressed = FreshlyPressed;
    }

    public Tags withFreshlyPressed(org.agorava.wordpress.model.FreshlyPressed FreshlyPressed) {
        this.FreshlyPressed = FreshlyPressed;
        return this;
    }

    @JsonProperty("Inspiration")
    public org.agorava.wordpress.model.Inspiration getInspiration() {
        return Inspiration;
    }

    @JsonProperty("Inspiration")
    public void setInspiration(org.agorava.wordpress.model.Inspiration Inspiration) {
        this.Inspiration = Inspiration;
    }

    public Tags withInspiration(org.agorava.wordpress.model.Inspiration Inspiration) {
        this.Inspiration = Inspiration;
        return this;
    }

    @JsonProperty("Recommended Reading")
    public org.agorava.wordpress.model.RecommendedReading getRecommendedReading() {
        return RecommendedReading;
    }

    @JsonProperty("Recommended Reading")
    public void setRecommendedReading(org.agorava.wordpress.model.RecommendedReading RecommendedReading) {
        this.RecommendedReading = RecommendedReading;
    }

    public Tags withRecommendedReading(org.agorava.wordpress.model.RecommendedReading RecommendedReading) {
        this.RecommendedReading = RecommendedReading;
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
