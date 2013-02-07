package org.agorava.wordpress.model.jsonMapping;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.agorava.wordpress.model.Category;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Test;

public class CategoriesTest extends JsonMappingTest {
	@Test
	public void testLoadingJSON() throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
		Category c = loadJsonFor("json/categories/data.json", Category.class);
		assertThat(c.getName(), Is.is("Community"));
		assertThat(c.getMeta(), IsNull.notNullValue());
		assertThat(c.getMeta().getLinks(),
				allOf(
			            hasEntry("self", new URL("https://public-api.wordpress.com/rest/v1/sites/3584907/categories/slug:community")),
			            hasEntry("help", new URL("https://public-api.wordpress.com/rest/v1/sites/3584907/categories/slug:community/help")),
			            hasEntry("site", new URL("https://public-api.wordpress.com/rest/v1/sites/3584907"))
						)
						);
	}
}
