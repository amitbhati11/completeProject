package javaprogram;

import org.testng.annotations.Test;

public class swapnumber {
	@Test
	public void swapnum() {
		int a=234; int b=256;
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("val of a&b"+a+b);
	}

}
