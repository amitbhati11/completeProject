package javaprogram;

import org.testng.annotations.Test;

public class revresenumPalendirom {
	
	@Test
	public void revrsenum() {
		
		int num=1234567891;
		int revnum=0;
		while(num>0) {
		
		int remind=num%10;
		revnum=revnum*10+remind;
		num=num/10;
		}
		System.out.println(revnum);
	}
	
	
	@Test
	
	public void palindrom() {
		int num=78087;
		int revnum=0;
		int temp;
		temp=num;
		while(num>0) {
			int remind=num%10;
			revnum=revnum*10+remind;
			num=num/10;
			}if(temp==revnum) {
				System.out.println("palindrom-->"+revnum);
			}else {
				System.out.println("not palindrom-->"+revnum);
			}
	}

}
