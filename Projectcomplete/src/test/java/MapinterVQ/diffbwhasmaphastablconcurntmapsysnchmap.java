package MapinterVQ;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class diffbwhasmaphastablconcurntmapsysnchmap {

	public static void main(String[] args) {

		//1.Hashmap-not syncronized,not thread safe,faster,canhave one null key and multiple values
		//2.hashtable-lock are there, synchronized,thread-safe,slower,not allow null key and  null values
		//second thread is waiting for first thread completion(at a time only one thread is working)
		//3. synchronized map is synchronized like hash table,thread-safe,slower,allow null key and multipe null values
		//Multiple thread concurrency it has poor performance bcoz lots of thread waiting outside
	/*4. concurrent hashmap(after jdk 1.5)-in concurrent hashmap there is a complete object and by default 16 segments and 
	there two operations Read and write i.e: for write operation particular segment is applied,so that is a good things on segment
	level lock is applied. another thread applied on another segment and from write operation.write and update level there is lock
	there is no lock for read opertion multi thread of read can applied for same sagment or different
	###Thread safe for write,and faster in performance for read no wait for thread execution
	##null keys and values are not allowed
	always get updated value
	*/
		//how to create syncronizedhasmap
		
		Map<String,String> map1=new HashMap<>();
		map1.put("A", "1");
		map1.put("B", "2");
		map1.put("C", "3");
		
		Map<String,String> syncmap= Collections.synchronizedMap(map1);
		System.out.println(syncmap);
		System.out.println(syncmap.get("B"));
		System.out.println("============");
		//Concurrenthashmap:it does not throw any concurrentmodificationException
		ConcurrentHashMap<String,String> concurntmap=new ConcurrentHashMap<>();
		concurntmap.put("A", "java");
		concurntmap.put("B", "Ruby");
		concurntmap.put("C", "python");
		System.out.println(concurntmap.get("C"));
		
	}

}
