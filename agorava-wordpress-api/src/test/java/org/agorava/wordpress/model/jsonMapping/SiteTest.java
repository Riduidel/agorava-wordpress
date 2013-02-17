package org.agorava.wordpress.model.jsonMapping;

import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.net.URISyntaxException;

import org.agorava.wordpress.model.Site;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.junit.Test;

public class SiteTest extends JsonMappingTest {
	@Test
	public void testLoadingJSON() throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
		Site c = loadJsonFor("json/sites/data.json", Site.class);
		assertThat(c.getName(), IsNull.notNullValue());
	}
}
