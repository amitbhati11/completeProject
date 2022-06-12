package ArraylistInterviewQ;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistOperation {
	
	public static void main(String [] args) {
		//create to-array list and print
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println(li);
		
		ArrayList<Integer> l2=new ArrayList();
		l2.add(5);
		l2.add(6);
		l2.add(2);
		l2.add(4);
		  li.addAll(l2);
		  System.out.println(l2);
		  System.out.println(li);
		
Collections.sort(l2);
System.out.println(l2);
 
        
	}

}
