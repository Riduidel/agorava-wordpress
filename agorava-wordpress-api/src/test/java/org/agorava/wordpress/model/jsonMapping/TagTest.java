package org.agorava.wordpress.model.jsonMapping;

import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;

import org.agorava.wordpress.model.Tag;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.hamcrest.core.IsNull;
import org.junit.Test;

public class TagTest extends JsonMappingTest {
	@Test
	public void testLoadingJSON() throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
		Tag c = loadJsonFor("json/tags/data.json", Tag.class);
		assertThat(c.getName(), IsNull.notNullValue());
	}
}
