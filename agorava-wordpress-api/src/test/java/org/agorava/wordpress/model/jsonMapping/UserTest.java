package org.agorava.wordpress.model.jsonMapping;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.agorava.wordpress.model.User;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Test;

public class UserTest extends JsonMappingTest {

	@Test
	public void testLoadingJSON() throws JsonParseException, JsonMappingException, IOException, URISyntaxException {
		User user = loadJsonFor("json/users/data.json", User.class);
		assertThat(user, IsNull.notNullValue());
		assertThat(user.getID(), Is.is(1001000100));
		assertThat(user.getAvatarURL(), Is.is("http://0.gravatar.com/avatar/a178ebb1731d432338e6bb0158720fcc?s=96&d=identicon&r=G"));
		assertThat(user.getMeta(), IsNull.notNullValue());
		assertThat(user.getMeta().getLinks(),
				allOf(
			            hasEntry("self", new URL("https://public-api.wordpress.com/rest/v1/me")),
			            hasEntry("help", new URL("https://public-api.wordpress.com/rest/v1/me/help")),
			            hasEntry("site", new URL("https://public-api.wordpress.com/rest/v1/sites/30434183"))
						)
						);
	}
}
