package javaprogram;

import org.testng.annotations.Test;

public class oddevnprogram {

	@Test
	
	public void oddevennumber() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("even number are -->"+i);
			}else {
				System.out.println("odd no are-->"+i);
			}
		}
	}
}
