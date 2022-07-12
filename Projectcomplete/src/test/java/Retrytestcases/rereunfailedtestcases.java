package Retrytestcases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class rereunfailedtestcases {
	
	@Test(retryAnalyzer=Retry.class)
	
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(retryAnalyzer=Retry.class)
	
	
	public void test2() {
		System.out.println("test2");
		int b= 1/0;
	}

	

	@Test(retryAnalyzer=Retry.class)
	
	
	public void test3() {
		System.out.println("test3");
		
		Assert.assertTrue(0>1);
	}

}
