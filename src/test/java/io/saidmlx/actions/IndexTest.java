package io.saidmlx.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsTestCase;

public class IndexTest extends StrutsTestCase {

    public void testIndex() throws Exception {
    	System.out.println("-.");
    	Index index = new Index();
        System.out.println(".");
        String result = index.execute();
        System.out.println("..");
        assertTrue("Expected a success result!", ActionSupport.SUCCESS.equals(result));
        System.out.println("...");
        assertTrue("Expected the 'hello' action name!!", "hello".equals(index.getRedirectName()));
        System.out.println("....");
    }
}
