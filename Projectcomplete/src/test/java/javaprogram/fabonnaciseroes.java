package javaprogram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class fabonnaciseroes {
	
	@Test
	
	public void fabbonaci() {
		
		Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("val of a-->"+a);
	int b=sc.nextInt();
	int c;
	System.out.println("val of b-->"+b);
		for(int i=1;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println("fabonaci series are"+c);
			
		}
	}
	

}
