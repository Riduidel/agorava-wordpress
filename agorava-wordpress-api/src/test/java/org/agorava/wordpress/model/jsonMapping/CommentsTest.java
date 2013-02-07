package org.agorava.wordpress.model.jsonMapping;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.agorava.wordpress.model.CommentList;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.junit.Test;

public class CommentsTest extends JsonMappingTest {
	@Test
	public void testLoadingJSON() throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
		CommentList c = loadJsonFor("json/comments/data.json", CommentList.class);
		assertThat(c.getFound(), IsNot.not(0));
	}
}
