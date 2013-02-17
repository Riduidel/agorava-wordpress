package org.agorava.wordpress.model;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class CommentParentDeserializer extends JsonDeserializer<Parent> {

	@Override
	public Parent deserialize(JsonParser jp, DeserializationContext ctxt) {
		try {
			return jp.readValueAs(Parent.class);
		} catch (Exception e) {
			/* well, wordpress sends either 
			 * parent:a parent object which should be resolved to a Parent object
			 * or
			 * parent:false which should simply resolve to no parent
			 */
			return null;
		}
	}

}
