package javaprogram;

import org.testng.annotations.Test;

public class factorial {
@Test

public void testfact() {
	int Fact=8;
	for(int i=Fact-1;i>0;i--) {
		Fact=Fact*i;
	}System.out.println(Fact);
}
}