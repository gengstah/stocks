package org.cognoscenti.stocks.util;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.junit.Test;

public class CustomJsonDoubleDeserializerTest {
	
	@Test
	public void testDeserialize() throws JsonParseException, IOException {
		CustomJsonDoubleDeserializer deserializer = new CustomJsonDoubleDeserializer();
		JsonParser jsonParser = mock(JsonParser.class);
		
		when(jsonParser.getText()).thenReturn("-0.74").thenReturn("1.02").thenReturn("1,610.05");
		
		assertEquals(new Double(-0.74D), deserializer.deserialize(jsonParser, null));
		assertEquals(new Double(1.02D), deserializer.deserialize(jsonParser, null));
		assertEquals(new Double(1610.05D), deserializer.deserialize(jsonParser, null));
	}
}