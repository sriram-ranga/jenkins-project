package org.jenkins.jenkins_project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Test for JENKINS with Git");
    	App firstObject = new App();
    	int x = firstObject.returnSumOfTwoNumbers(5,10);        
    }
	public int returnSumOfTwoNumbers(int a,int b){
		int c = a + b;
		return c;
	}
	

}
