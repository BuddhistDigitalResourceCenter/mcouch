package mcouch.core.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

public class ViewCustomStructureResponse {
    @JsonProperty
    private String id;
    @JsonProperty
    private String key;
    @JsonProperty
    @JsonRawValue
    private String value;

    public ViewCustomStructureResponse() {
    }

    public ViewCustomStructureResponse(String id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }
}