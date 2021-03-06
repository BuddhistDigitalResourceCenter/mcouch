package mcouch.core.couch.indexing.query;

import mcouch.core.couch.indexing.IndexEntry;
import mcouch.core.couch.indexing.IndexKey;
import mcouch.core.couch.indexing.View;

import java.util.Map;

public class AllQuery implements IndexQuery {
    @Override
    public Map<IndexKey, IndexEntry> execute(View view) {
        return view.all();
    }
}