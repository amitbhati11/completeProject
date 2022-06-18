package Linkedlistd;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	/*#it has the methods of list,stack,and queue
	#allow null values
	#dynamic in nature , size is not fixed
	#insertion and deletion is very fast as compare to array(have next pointer point to next node )
	#it can contain duplicate value
	#it is not synchronized and thread-safe*/
	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<>();
		ll.add("Amit");//0
		ll.add("Sumit");//1
		ll.add("Punit");//2
		System.out.println(ll.size());
		System.out.println(ll);
		ll.add("Raj");//3
		ll.add("Vir");//4
		ll.add("Sachin");//5
		ll.add("Test");//6
		System.out.println(ll);
		ll.add(4, "mayank");
		ll.add(0, "Lobish");//shifting dynamically
		System.out.println(ll);
		//adding one list to another list
		LinkedList<String> user=new LinkedList<>();
		user.add("Ram");
		user.add("Shiva");
		ll.addAll(user);
		System.out.println(ll);
		ll.addFirst("Tom");
		System.out.println(ll);
		ll.addLast("messi");
		System.out.println(ll);
		
		ll.remove(5);
		System.out.println(ll);
		ll.removeAll(user);
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		//to remove completely list
		ll.clear();
		System.out.println(ll);
		
		LinkedList<String> lang=new LinkedList<>();
		
		lang.add("Java");
		lang.add("python");
		lang.add("Ruby");
		lang.add("Javascript");
		System.out.println(lang);
		//reverse linkedlist
		System.out.println("==============");
		   Iterator<String> it=  lang.descendingIterator();
		   while(it.hasNext()) {
			   System.out.println(it.next());
		   }
		   System.out.println("==============");
		   for(int i=lang.size()-1;i>=0;i--) {
			   System.out.println(lang.get(i));
		   }
		   
		   //#treversing
		   System.out.println("==============");
		   lang.forEach(e->System.out.println(e));
		   System.out.println("==============");
		   for(String s:lang) {
			   System.out.println(s);
		   }
		
		//sort
		   Collections.sort(lang);
		   System.out.println("==============");
		   System.out.println(lang); 
		   
	}

}
