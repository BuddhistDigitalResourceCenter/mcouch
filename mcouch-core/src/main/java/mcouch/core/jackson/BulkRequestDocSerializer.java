package mcouch.core.jackson;

import mcouch.core.http.request.body.BulkRequestDoc;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class BulkRequestDocSerializer extends JsonDeserializer<BulkRequestDoc> {
	private static final ObjectMapper om = new ObjectMapper();
	
    @Override
    public BulkRequestDoc deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        return new BulkRequestDoc(om.writeValueAsString(node));
    }
}