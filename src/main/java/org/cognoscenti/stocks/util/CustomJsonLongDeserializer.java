package org.cognoscenti.stocks.util;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class CustomJsonLongDeserializer extends JsonDeserializer<Long> {

	@Override
	public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException {
		
		try {
			return NumberFormat.getInstance().parse(jsonParser.getText()).longValue();
		} catch (ParseException e) { e.printStackTrace(); }
		
		return null;
	}
	
}