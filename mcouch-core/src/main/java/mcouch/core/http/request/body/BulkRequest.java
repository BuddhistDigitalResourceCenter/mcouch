package mcouch.core.http.request.body;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkRequest {
    @JsonProperty
    public List<BulkRequestDoc> docs;
}