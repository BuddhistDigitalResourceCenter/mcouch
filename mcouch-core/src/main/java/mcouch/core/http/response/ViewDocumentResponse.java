package mcouch.core.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

public class ViewDocumentResponse {
    @JsonProperty
    private String id;
    @JsonProperty
    private String key;
    @JsonProperty
    private String value;
    @JsonProperty
    @JsonRawValue
    private String doc;

    public ViewDocumentResponse() {
    }

    public ViewDocumentResponse(String id, String key, String value, String doc) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.doc = doc;
    }
}