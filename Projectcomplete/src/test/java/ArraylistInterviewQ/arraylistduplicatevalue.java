package ArraylistInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public  class arraylistduplicatevalue {
	
	public static void main(String [] args) {
		
		//remove the  duplicate values in arraylist
		
		/*ArrayList<Integer> l1=new ArrayList<Integer>(Arrays.asList(2,3,4,9,5,6,3,2));
		
		Collections.sort(l1);
		System.out.println(l1);
		
		for (int i=0;i<l1.size();i++) {
			for(int j=i+1;j<l1.size();j++) {
				
			}
		}
		*/
		
		//1. jdk8-stream
		//linked hashset
		ArrayList<Integer>  l2=new ArrayList<Integer>(Arrays.asList(2,1,2,1,3,6,8));
		
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
	List<Object> uniqulist=l2.stream().distinct().collect(Collectors.toList());
		
	System.out.println(uniqulist+"###");
		
		//2. linkedhashset
 		
		ArrayList<String>  l4=new ArrayList();
		l4.add("Sachin");
		l4.add("Amit");
		l4.add("Sachin");
		l4.add("shewagh");
		System.out.println(l4);
		
		Collections.sort(l4);
		System.out.println(l4);
		
		LinkedHashSet<String> lsh=new LinkedHashSet(l4);
		ArrayList<String> l5=new ArrayList(lsh);
		System.out.println(l5);
		
		//3. findout duplicate values in Arraylist
		
		ArrayList<Integer> duplicate=new ArrayList<>(Arrays.asList(1,2,3,4,5,2,3,1));
		System.out.println(duplicate);
		
		Set<Integer> se=new HashSet<>();
		for(int b:duplicate) {
			if(se.add(b)==false) {
				System.out.println("duplicate are: "+b);
			}
		}
		
		
	}

}
