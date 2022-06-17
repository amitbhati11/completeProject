package MapinterVQ;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

public class Treemap {

	public static void main(String[] args) {

		//sortedMap extend map which implemnent by Tree map class
		//Treemap does not work upon hashing concept(hascode>index>key>val>)
		//maintan ascending order by default and sorting(its a sorted map) on keys
		//red,black concept if node is red then child should be black,leaves are blacks
		// node have two leave thry end with null
		//every route have three black node
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(500,"A");
		map.put(2000, "B");
		map.put(1000,"C");
		map.put(700, "D");
		map.put(300, "D");
		map.put(40, "D");
		System.out.println(map);
		
		
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		// want to print value less thern 1000
		System.out.println("=======");
		Set<Integer> vls= map.headMap(1000).keySet();
		System.out.println(vls);
	// want keys more then 700
		System.out.println("=======");
		Set<Integer> grtr=map.tailMap(700).keySet();
		System.out.println(grtr);
		
		//
		System.out.println("=======");
		TreeMap<String,Integer> map1=new TreeMap<>();
		map1.put("Zolo", 100);
		map1.put("Raka", 500);
		map1.put("Amit", 10);
		map1.put("Cam", 120);
		map1.put("Ted", 50);
		map1.put("Garry", 1000);//case sensitive
		
		map1.forEach((k,v)->System.out.println("k: "+k+ " v:"+v));
		System.out.println("========");
		//to achieve descending order
		TreeMap<String,Integer> map2=new TreeMap<>(Comparator.reverseOrder());
		map2.put("Zolo", 100);
		map2.put("Raka", 500);
		map2.put("Amit", 10);
		map2.put("Cam", 120);
		map2.put("Ted", 50);
		map2.put("Garry", 1000);
		map2.forEach((k,v)->System.out.println("k: "+k+ " v:"+v));
	}

}
