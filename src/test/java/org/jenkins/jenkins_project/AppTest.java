package org.jenkins.jenkins_project;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{    
    @Test
    public void testReturnSumOfTwoNumbers(){
    	App testObj = new App();
    	int result = testObj.returnSumOfTwoNumbers(20, 10);
    	assertEquals(30,result);
    }
    
}
