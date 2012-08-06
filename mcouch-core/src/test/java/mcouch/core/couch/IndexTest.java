package mcouch.core.couch;

import junit.framework.Assert;
import mcouch.core.couch.indexing.View;
import mcouch.core.couch.indexing.IndexKey;
import mcouch.core.rhino.EmitFunction;
import mcouch.core.rhino.MapFunctionInterpreter;
import org.junit.Test;

import java.util.List;

public class IndexTest {
    @Test
    public void addOrUpdate() throws Exception {
        EmitFunction emitFunction = new EmitFunction();
        View view = new View("anything", new MapFunctionInterpreter(emitFunction), null, emitFunction);
        view.addOrUpdate("abc", "1");
        view.addOrUpdate("gsh", "2");
        view.addOrUpdate("jcw", "3");
        view.addOrUpdate("esa", "4");
        view.addOrUpdate("pds", "5");
        view.addOrUpdate("sfs", "6");
        List<String> docIds = view.itemsBetween(new IndexKey("abc"), new IndexKey("esa"));
        Assert.assertEquals(2, docIds.size());
    }
}