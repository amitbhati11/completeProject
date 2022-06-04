package javaprogram;

import org.testng.annotations.Test;

public class RevrseString {
	@Test
	public void revstring() {
		String name="Subhash";
		int count=name.length();
		String b="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			b=b+name.charAt(i);
		}System.out.println(b+"---->string is");
	}

}
