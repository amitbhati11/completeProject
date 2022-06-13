package MapinterVQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapitteratior {

	public static void main(String[] args) {

		//no ordering-no indexing
		//value sotred in Key,value pair
		//accept only one null key, and can have multiple null value
		//un synchronized,no- threadsafe
		//implement map interface
		//can not have duplicate key
		
		HashMap<String,String> citymap=new HashMap<>();
		
		citymap.put("UP", "Noida");
		citymap.put("MP", "indore");
		citymap.put("JK", "Srinagar");
		citymap.put("UP","Dadri");
		citymap.put(null, "Srinagar");
		citymap.put(null, "ladupar");//give the laset value for null key
		citymap.put("MH", "Srinagar");
		citymap.put("UP","Dadri");
		citymap.put("Raj", null);
		citymap.put("Pun",null);
		citymap.remove("UP");
		
		System.out.println(citymap.get("UP"));
		System.out.println(citymap.get(null));
		System.out.println(citymap.get("MH"));
		System.out.println(citymap.get("JK"));//can have duplicate value
		System.out.println(citymap.get("Raj"));
		System.out.println(citymap.get("pun"));//can have muliple null value
		System.out.println(citymap.get("TN"));//if the key is not threr then not given any exception but give null value
		
		//iteratior of hashmap by using keyset() method
		  Iterator<String> it  =citymap.keySet().iterator();
		   
		  while(it.hasNext()) {
			String key= it.next();
			String value=citymap.get(key);
			System.out.println("key:"+key+"-val:-"+value);
	}
		  System.out.println("========");
		  //itterator by using setentry
		Iterator<Entry<String,String>>  sit=  citymap.entrySet().iterator();
		
	while(sit.hasNext()) {
		
		Entry<String,String> val=sit.next();
		System.out.println("Key :"+val.getKey()+"--val"+val.getValue());
	}
		  
		  //by using lambda expression
	 System.out.println("========");
		  citymap.forEach((k,v)->System.out.println("key:"+k+"val"+v));

}
}