package mcouch.core.http.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnclosedResponseForBulkRequest {
    @JsonProperty
    public String _id;
    @JsonProperty
    public String _rev;

    public EnclosedResponseForBulkRequest() {
    }

    public EnclosedResponseForBulkRequest(String _id, String _rev) {
        this._id = _id;
        this._rev = _rev;
    }
}