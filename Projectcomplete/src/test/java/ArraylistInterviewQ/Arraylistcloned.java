package ArraylistInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

public class Arraylistcloned {

	public static void main(String[] args) {
//adding data in ordering
		
		 ArrayList<String> name=new ArrayList<String>();
		name.add("java");
		name.add("python");
		name.add("Ruby");
		name.add("C#");
		ArrayList<String> nm=new ArrayList<String>();
		nm.add("Testing");
		nm.add("dev");
//adding one list to another list-toarraylist		
	/*	name.addAll(nm);
		System.out.println(name);*/
	// want add from 2nd index of list first
		
		/*name.addAll(2,nm);
		System.out.println(name);*/
		
		//clear list
		System.out.println("-----");
	/*	name.clear();
		System.out.println(name);*/
		
		//clone Arraylist
		
		 ArrayList<String>  clonlist  = (ArrayList<String>)name.clone();
		 System.out.println("------");
		 System.out.println(clonlist);
		 //checking index of
		 
		System.out.println( name.indexOf("Ruby"));
		
		//contains wheteher element are present or not
		
		System.out.println(name.contains("python"));
		System.out.println("=====");
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Amit","Sumit","Punit","Amit"));
		System.out.println(list);
		//lastindexof
		System.out.println(list.lastIndexOf("Amit"));
		//check wheteher is present or not
		System.out.println("=====");
		System.out.println(list.lastIndexOf("Sachin"));//-1 if is not present
		//remove method is used to remove or delete the data
		System.out.println("=====");
		list.remove(2);
		System.out.println(list);
		list.add("Lisa");
		list.add("naveen");
		System.out.println("=====");
		System.out.println(list);
		System.out.println("=====");
		//remove particular element
		list.remove("Amit");
		System.out.println(list);
		//create a list and remove odd number from them
		System.out.println("=====");
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		/*list2.removeIf(n->n%2==0);
		System.out.println(list2);*/
		//print only even num
		list2.removeIf(m->m%2!=0);
		System.out.println(list2);
		System.out.println("=====");
		//Retain-allmethod means find the list of a particular in arraylist
		ArrayList<String> list3=new ArrayList<String>(Arrays.asList("Amit","Tom","bikash","Sanjay","Amit"));
		list3.retainAll(Collections.singleton("Amit"));
		System.out.println(list3);
		System.out.println("=====");
		//create sublist form a list
		ArrayList<String> list4=new ArrayList<String>(Arrays.asList("Amit","Tom","bikash","Sanjay","Amit","Rajneesh","Naveen"));
		ArrayList<String> sublist=new ArrayList<String>(list4.subList(4, 6));
	System.out.println(sublist);
	
	//imp#########-convert Arraylist to an Array by to-arraymethod
	System.out.println("=====");
	
	ArrayList<String> newlist=new ArrayList<String>(Arrays.asList("Mayank","Shiba","jeba","Raj"));
	
	Object  arr[]=newlist.toArray();
	System.out.println(Arrays.toString(arr));
	System.out.println("=====");
	for(Object o:arr) {
		System.out.println(o);
	}
	System.out.println("=====");
	for(int b=0;b<arr.length;b++) {
		System.out.println(arr[b]);
	}
	
	}

}
