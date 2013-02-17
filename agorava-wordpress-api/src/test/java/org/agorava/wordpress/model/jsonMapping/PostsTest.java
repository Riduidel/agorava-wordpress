package org.agorava.wordpress.model.jsonMapping;

import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;

import org.agorava.wordpress.model.PostList;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.hamcrest.core.IsNot;
import org.junit.Test;

public class PostsTest extends JsonMappingTest {
	@Test
	public void testLoadingJSON() throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
		PostList c = loadJsonFor("json/posts/data.json", PostList.class);
		assertThat(c.getFound(), IsNot.not(0));
	}
}
