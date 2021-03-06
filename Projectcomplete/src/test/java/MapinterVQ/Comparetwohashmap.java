package MapinterVQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Comparetwohashmap {
	
	public static void main(String [] xyz) {
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		
		map2.put(3,"C");
		map2.put(1, "A");
		map2.put(2,"B");
		
		HashMap<Integer,String> map3=new HashMap<Integer,String>();
		
		map3.put(2,"B");
		map3.put(1,"A");
		map3.put(3,"C");
		map3.put(2,"D");
		
		
		//1. compare on basis of key-value pair
		
		System.out.println(map1.equals(map2));//true(* ordering is not there for)
		System.out.println(map1.equals(map3));//false
		System.out.println("======");
		//2. compare of on basis of key,by using keyset()
		System.out.println(map1.keySet().equals(map2.keySet()));//true
		System.out.println(map1.keySet().equals(map3.keySet()));//return true because it return (keyset) set which is ignore duplicay
		System.out.println("======");
		
		//3.finout extrakey
		HashMap<Integer,String> map4=new HashMap<Integer,String>();
		
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		//combine/union keys from both map by using hashset
		
		HashSet<Integer>  combinekeys=new HashSet( map1.keySet());
		combinekeys.addAll(map4.keySet());
		combinekeys.removeAll(map1.keySet());
		System.out.println(combinekeys);
		System.out.println("======");
		
		//4. compare maps by values
		
HashMap<Integer,String> map5=new HashMap<Integer,String>();
		
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
			HashMap<Integer,String> map6=new HashMap<Integer,String>();
		
		map6.put(5,"A");
		map6.put(6, "B");
		map6.put(7,"C");
		
		HashMap<Integer,String> map7=new HashMap<Integer,String>();
		
		map7.put(2,"A");
		map7.put(1,"B");
		map7.put(3,"C");
		map7.put(4,"C");
		System.out.println("======");
	//not allows duplicate value then use arraylistconcept
		   System.out.println((new ArrayList<>(map5.values()).equals((new ArrayList<>(map6.values())))));//true
		   System.out.println((new ArrayList<>(map5.values()).equals((new ArrayList<>(map7.values())))));//false it does not negelate any value
		   System.out.println("======");
		   System.out.println((new HashSet<>(map5.values()).equals((new HashSet<>(map6.values())))));//true
		   System.out.println((new HashSet<>(map5.values()).equals((new HashSet<>(map7.values())))));//true
		   
	}

}
