package mcouch.core.http.request.body;

import mcouch.core.jackson.BulkRequestDocSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = BulkRequestDocSerializer.class)
public class BulkRequestDoc {
    public String json;

    public BulkRequestDoc(String json) {
        this.json = json;
    }

    public BulkRequestDoc() {
    }
}