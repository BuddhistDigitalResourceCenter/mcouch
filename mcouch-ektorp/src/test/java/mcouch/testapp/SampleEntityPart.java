package mcouch.testapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SampleEntityPart {
    @JsonProperty
    public String a;
    @JsonProperty
    public String type;
}