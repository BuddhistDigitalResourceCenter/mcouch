package mcouch.core.http.response;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ViewDocumentsResponse {
    @JsonProperty
    private int total_rows;
    @JsonProperty
    private int offset;
    @JsonProperty
    private List<Object> rows = new ArrayList<Object>();

    public ViewDocumentsResponse(int total_rows, int offset) {
        this.total_rows = total_rows;
        this.offset = offset;
    }

    public void add(Object object) {
        rows.add(object);
    }
}