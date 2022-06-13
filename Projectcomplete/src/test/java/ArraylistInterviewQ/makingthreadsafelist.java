package ArraylistInterviewQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import groovy.transform.Synchronized;

public class makingthreadsafelist {

	public static void main(String[] args) {

		//how to make Arraylist thread safe
		//1. by using Collections.Synchronizedlist-method
		//2.copyonwriteArraylist-threadsafe varint() of arraylist
		
		
	List<String> name=	Collections.synchronizedList(new ArrayList<String>());
	
	  name.add("Amit");
	  name.add("Sachin");
	  name.add("Vikash");
	
	   //add,remove-we don't need explicit synchonization
	  //to fetch/traverse the value of the list-need explicit synchronization
	  
	  //lambda-expression
	    // name.stream().forEach(e->System.out.println(e));
	  
	   synchronized(name){
		      
		  Iterator<String>  lst= name.iterator();
		  
		  while(lst.hasNext()) {
			  System.out.println(lst.next());
		  }
	   }
	   
	   //2. CopyOnWriteArrayList-its a class:Thread-safe/synchronized already
	   
	   CopyOnWriteArrayList<String>  ll=new CopyOnWriteArrayList<String>();
	   ll.add("Suraj");
	   ll.add("monu");
	   ll.add("rockey");
	   //do not required to fetch/treverse  value any explicit synchronization
	   
	   System.out.println(ll);
	   System.out.println("===");
	   
	   for(String o:name) {
		   System.out.println(o);
	   }
	   System.out.println("===");

	   for(int i=0;i<name.size();i++) {
		   System.out.println(name.get(i));
	   }
	}

}
