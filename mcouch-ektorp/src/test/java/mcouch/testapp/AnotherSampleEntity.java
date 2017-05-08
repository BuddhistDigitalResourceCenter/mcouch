package mcouch.testapp;

import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

@TypeDiscriminator("doc.type == 'AnotherSample'")
public class AnotherSampleEntity extends CouchDbDocument {
	private static final long serialVersionUID = 3780491022057580991L;
	@JsonProperty
    private String type = "AnotherSample";
}