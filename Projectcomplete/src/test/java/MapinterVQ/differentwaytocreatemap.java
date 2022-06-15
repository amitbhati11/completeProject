package MapinterVQ;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

public class differentwaytocreatemap {

	public static Map<String,Integer> marksmap;
	static{
		marksmap=new HashMap<>();
		marksmap.put("Amit",100);
		marksmap.put("sumit",200);
	}
	public static void main(String[] args) {

		//1.bystaticmethod
		System.out.println(differentwaytocreatemap.marksmap.get("sumit"));
		//2.immutable map
		
		Map<String,Integer>  map1=Collections.singletonMap("Vickey",100);
		System.out.println(map1.get("Vickey"));
		//map1.put("Rakesh",100);
	//	System.out.println(map1.get("Rakesh"));//UnsupportedOperationException(we can't change the value)
		
		//3. jdk8 
		//creating one 2D array of String using stream and collecting in the form map
		Map<String,String> map2=Stream.of(new String [][]{
			{"Amit", "A++"},
			{"Reena","W++"},
		}).collect(Collectors.toMap(e->e[0],e->e[1]));
		System.out.println(map2.get("Reena"));
 	
		//4.using simple entry method,abstractmap
		
		  Map<String,String> map5=Stream.of(
				  new AbstractMap.SimpleEntry<>("Amit","java"),
				  new AbstractMap.SimpleEntry<>("subh","C#"),
				  new AbstractMap.SimpleEntry<>("Amitabh","jdk")
			 ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		  System.out.println(map5.get("Amit"));
		  System.out.println(map5.get("subh"));
		  
		  //5. JDK 1.9 emptymap
		   
		//  HashMap<String,String> emptymap=Map.of();
		 // emptymap.put"Abs","ter");we can't do
		  //singletonmap
		/*  HashMap<String,String> singlton=Map.of("k1","V1");
		  System.out.println(singlton.get("k1"));
		  singlton.put("k2","v2");
		  System.out.println(singlton.get("k2"));//can't do
		  */
		//  multivalueMAP:max 10 key value pair can stored#mutablemap
		  
		    /*Map<String,String> multi=Map.of("k1","v1","k2","v2","k3","v3");
		    System.out.println(multi.get("k3"));*/
		    
		  //Map.ofenterie#immutable
		  
		/*Map<String,Integer> map7=    Map.ofEntries(
		    	new AbstractMap.SimpleEntry<>("A",100),
		    	new AbstractMap.SimpleEntry<>("B",200),
		    	new AbstractMap.SimpleEntry<>("C",300)
		    );
		    System.out.println(map7.get("B"));
		    */
		    //guvava lib using
		    
		 Map<String,String> map8=   ImmutableMap.of("k1", "v1", "k2", "v2", "k3", "v3");
		System.out.println(map8.get("k3"));
	}

}
