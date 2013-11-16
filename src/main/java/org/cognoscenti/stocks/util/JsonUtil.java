package org.cognoscenti.stocks.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

public class JsonUtil {
	
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	private static final JsonUtil INSTANCE = new JsonUtil();
	
	private JsonUtil() { }
	
	public static JsonUtil getInstance() {
		return INSTANCE;
	}

	public <T> List<T> readValueFromUrlToList(String url, Class<T> clazz) {
		try {
			return OBJECT_MAPPER.readValue(
					createUrlObject(url), 
					TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, clazz));
		} catch (JsonParseException e) { e.printStackTrace();
		} catch (JsonMappingException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		return null;
	}
	
	public <T> T readValueFromJsonString(String response, Class<T> clazz) {
		try {
			return OBJECT_MAPPER.readValue(response, clazz);
		} catch (JsonParseException e) { e.printStackTrace();
		} catch (JsonMappingException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		return null;
	}
	
	public <T> List<T> readValueFromJsonStringToList(String response, Class<T> clazz) {
		try {
			return OBJECT_MAPPER.readValue(
					response, 
					TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, clazz));
		} catch (JsonParseException e) { e.printStackTrace();
		} catch (JsonMappingException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		return null;
	}
	
	private URL createUrlObject(String urlString) {
		URL url = null;
		
		try {
			url = new URL(urlString);
		} catch (MalformedURLException e) { e.printStackTrace(); }
		
		return url;
	}
	
}