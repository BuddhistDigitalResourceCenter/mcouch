package mcouch.core.http.request;

import mcouch.core.couch.database.Database;
import mcouch.core.couch.database.Databases;
import mcouch.core.couch.indexing.query.IndexQuery;
import mcouch.core.couch.indexing.query.IndexQueryFactory;
import mcouch.core.couch.view.ViewGroupDefinition;
import mcouch.core.http.NotImplementedException;
import mcouch.core.http.StandardHttpResponse;
import mcouch.core.rhino.JavaScriptInterpreter;
import org.apache.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CouchGetRequest implements CouchRequest {
	private CouchURI uri;
	private JavaScriptInterpreter javaScriptInterpreter;
	private static Logger logger = LoggerFactory.getLogger(CouchGetRequest.class);

	public CouchGetRequest(CouchURI uri, JavaScriptInterpreter javaScriptInterpreter) {
		this.uri = uri;
		this.javaScriptInterpreter = javaScriptInterpreter;
	}

	@Override
	public HttpResponse execute(Databases databases) {
		if (!databases.contains(uri.databaseName()))
			throw new NotImplementedException();

		Database database = databases.getDatabase(uri.databaseName());
		if (uri.isGetViewDocRequest()) {
			ViewGroupDefinition viewGroupDefinition = database.viewGroup(uri.viewGroup()).definition();
			return StandardHttpResponse.okWith(viewGroupDefinition.document());
		}
		if (uri.isDocRequest()) {
			String doc = database.get(uri.documentId());
			if (doc != null) {
				return StandardHttpResponse.okWith(doc);
			} else { 
				return StandardHttpResponse.DOC_NOT_FOUND;
			}
		}
		if (uri.isAllDocsRequest() || uri.isExecuteViewRequest()) {
			IndexQuery indexQuery = IndexQueryFactory.create(uri, javaScriptInterpreter);
			Page page = uri.page();
			String response = database.executeView(uri.viewGroup(), uri.viewName(), indexQuery, uri.isReduce(), page);
			if (logger.isDebugEnabled()) logger.debug(response);
			return StandardHttpResponse.okWith(response);
		}
		return null;
	}
}