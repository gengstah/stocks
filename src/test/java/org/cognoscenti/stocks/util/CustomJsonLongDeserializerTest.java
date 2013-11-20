package org.cognoscenti.stocks.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.junit.Test;

public class CustomJsonLongDeserializerTest {
	
	@Test
	public void testDeserialize() throws JsonParseException, IOException {
		CustomJsonLongDeserializer deserializer = new CustomJsonLongDeserializer();
		JsonParser jsonParser = mock(JsonParser.class);
		
		when(jsonParser.getText()).thenReturn("1,118,000").thenReturn("132,000");
		
		assertEquals(new Long(1118000), deserializer.deserialize(jsonParser, null));
		assertEquals(new Long(132000), deserializer.deserialize(jsonParser, null));
	}
	
}