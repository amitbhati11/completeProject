package javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class revrsestringdemo {

	public static void main(String[] args) {
 
		
		 String name="Baby";
		 
		 String a="";
		 
		 for(int i=name.length()-1;i>=0;i--) {
			 a=a+name.charAt(i);
			 
		 }System.out.println("revname is: "+a);
		System.out.println("=========");
		 
		 int num=23455;
		 int rev=0;
		 while(num>0) {
			int remind=num%10;
			 rev=rev*10+remind;
			num=num/10;
		 }System.out.println(rev);
		 
		 System.out.println("=========");
		 for(int i=1;i<=20;i++) {
			 if(i%2==0) {
				 System.out.println(i+" even");
			 }else {
				 System.out.println(i+"  odd");
			 }
		 }
		 
		 int k=1,l=2;
		 System.out.println(k);
		 System.out.println(l);
		 for(int j=1;j<=5;j++) {
			 int m=k+l;
			
			 System.out.println(m);
			 k=l;
			 l=m;
			  }
		 System.out.println("=========");
		 //factorial
		int fact=1;
		for(int i=5;i>0;i--) {
			fact=fact*i;
		}System.out.println(fact);
		
		//swap number
		 System.out.println("=========");
		int s=25,t=35;
		System.out.println(s+" bval of s"+t+"  bval of t");
		s=s+t;
		t=s-t;
		s=s-t;
		System.out.println(s+" aval of s"+t+"  aval of t");
		 System.out.println("=========");
		//convert arraylist to array
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	Object  [] arr=	list.toArray();
	for(Object z:arr) {
		System.out.println(z);
	}
	//2d arraylist
	System.out.println("=========");
	List<List<String>> listoption= new ArrayList<List<String>>();
	
	/*for(int i=0;i<listoption.size()-1;i++) {
		listoption.get(i).add("Amit");
		System.out.println(listoption.get(i).add("Amit"));
	}*/
	
	ArrayList [][] table=new ArrayList[5][4];
	table[0][0].add("test");
	table[0][1].add("test1");
	table[0][2].add("test2");
	System.out.println();
	
		
	}

}
