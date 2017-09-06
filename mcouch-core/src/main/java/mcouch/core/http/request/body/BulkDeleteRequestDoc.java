package mcouch.core.http.request.body;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BulkDeleteRequestDoc {
    @JsonProperty
    public String _id;
    @JsonProperty
    public String _rev;
    @JsonProperty
    public boolean _deleted;
}