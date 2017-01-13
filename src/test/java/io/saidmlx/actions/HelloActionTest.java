package io.saidmlx.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsTestCase;

public class HelloActionTest extends StrutsTestCase {

    public void testHelloAction() throws Exception {
    	System.out.println("-*");
    	HelloAction hello = new HelloAction();
        System.out.println(hello);
        System.out.println("*");
        String result = hello.execute();
        System.out.println("**");
        assertTrue("Expected a success result!",ActionSupport.SUCCESS.equals(result));
        System.out.println("***");
        //assertTrue("Expected the default message!",hello.getText(HelloAction.MESSAGE).equals(hello.getMessage()));
        //assertTrue("Expected the default message!",hello.getText(HelloAction.MESSAGE).equals(hello.getMessage()));
        System.out.println("****");
    }
}
