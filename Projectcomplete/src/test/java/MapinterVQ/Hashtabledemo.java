package MapinterVQ;

import java.util.Hashtable;
import java.util.Map;

public class Hashtabledemo {

	public static void main(String[] args) {

		/*#hashtable is the legecy which starts form starting,thread-safe,synchronized,but slower 
		#does not allow any null keys and value
	    #its have 11 segment 
		#workng internally hashing concept,create hash code,->index->key->pointer*/
		
		Map<Integer,String> map=new Hashtable<>();
		map.put(1,"Amit");
		map.put(2,"Sumit");
		map.put(3,"Punit");
		map.put(4,"Ankit");
		map.put(5,"Vinit");
		map.put(6,"Rohit");
		map.put(null,"Shewagh");// java.lang.NullPointerException
		map.put(9, null);// java.lang.NullPointerException
		System.out.println(map.get(9));
		System.out.println(map.get(null));
	}

}
