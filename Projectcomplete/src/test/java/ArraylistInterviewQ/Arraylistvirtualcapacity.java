package ArraylistInterviewQ;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistvirtualcapacity {

	public static void main(String[] args) {
		//array is static in nature we can not change size in runtime
		//array list is dynamic insert data in ordering
//VirtualCapacity is by default is 10
//can not have (-) indexing 		
		 ArrayList<Integer> number=new ArrayList<Integer>(20);//can make vitrualcapacity 20
		 
		 number.add(1);
		System.out.println(number);
		System.out.println(number.size());
		System.out.println("------");
		
		ArrayList<Integer>  num=new ArrayList<Integer>();
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(1);
		System.out.println(num);
		System.out.println("------");
		//1. forloop
		
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i));
		}
		System.out.println("------");
		//2.for each
		for(int n:num) {
			System.out.println(n);
		}
		//3 lambda expression
		
		//num.stream().forEach(k->System.out.println(k));
	
		System.out.println("------");
	//4. iterator
	       Iterator<Integer> it=  num.iterator();
	       
	       while(it.hasNext()) {
	    	   System.out.println(it.next());
	       }
	}
}
