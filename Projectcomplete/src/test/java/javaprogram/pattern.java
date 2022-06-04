package javaprogram;

import org.testng.annotations.Test;

public class pattern {
	
	@Test
	public void righttringle() {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	
	public void rightbottom() {
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	@Test
	public void makerighttringle() {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}for(int i=0;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	
	public void lefttringle() {
		for(int i=0;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}for(int k=0;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	public void leftsidebottompatrn() {
		for(int i=0;i<=4;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}for(int j=4;j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	
	public void leftsidecompletepatrn() {
		for(int i=0;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}for(int k=0;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i=0;i<=4;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}for(int j=3;j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	public void completepyramide() {
		
				for(int i=1;i<=100;i++) {
					int count=1;

			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			
			System.out.println();
		}
	}
	
	@Test
	public void alphanumeric() {
		
		for(int i=1;i<=26;i++) {
			int alpha=65;
			for(int j=1;j<=i;j++) {
				System.out.print((char)alpha+" ");
				alpha++;
			}System.out.println();
		}
		for(int i=1;i<=26;i++) {
			int alpha=65;
			for(int j=26;j>i;j--) {
				System.out.print((char)alpha+" ");
				alpha++;
			}System.out.println();
		}
	}

}
