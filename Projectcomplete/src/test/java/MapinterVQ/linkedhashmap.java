package MapinterVQ;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class linkedhashmap {

	public static void main(String[] args) {
//maintan insertion  order because of doubly linkedlist
		//Stored value in k,v pair
		//node connect with doubly link list to each other after of one node connect before with other node
		//allow one null key and multiple null values
		//non synchronized,not thread-safe
		
		Map<String,Integer> linkmap=new LinkedHashMap<>();
		
		linkmap.put("Amit", 100);
		linkmap.put("sumit", 100);
		linkmap.put("punit", 100);
		linkmap.put("vinit", 100);
		System.out.println(linkmap);
		
		//iterator
		
	Iterator<Entry<String,Integer>> it=	linkmap.entrySet().iterator();
	
	while(it.hasNext()) {
		
		      Entry<String,Integer>  val = it.next();
		      System.out.println("key: "+val.getKey()+" val:"+val.getValue());//fecthing the value in same order as they insertion
		      }
	System.out.println("=======");
	            Iterator<String> itr= linkmap.keySet().iterator();
	            
	            while(itr.hasNext()) {
	            	String keys=   itr.next();
	            	Integer values= linkmap.get(keys);
	            	System.out.println("keys: "+keys+ "  valus:"+values);
	            	
	            }
	            //lambda expression
	            System.out.println("=======");
	            linkmap.forEach((k,v)->System.out.println(" k:"+k+ " v:"+v));
	            
	            //inhance forloop
	            
	            /*for(String kk:linkmap) {
	            	System.out.println("key: "+kk );
	            }*/
	}

}
