package org.agorava.wordpress.model.jsonMapping;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonMappingTest {

	public static final ObjectMapper mapper = new ObjectMapper();

	protected <Type> Type loadJsonFor(String jsonFile, Class<Type> type)
			throws IOException, JsonParseException, JsonMappingException,
			URISyntaxException {
				URL resource = getClass().getClassLoader().getResource(jsonFile);
				return mapper.readValue(new File(resource.toURI()), type);
			}

}
