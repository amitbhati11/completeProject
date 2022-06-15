package MapinterVQ;

import java.util.HashMap;

public class colliosionhassmap {
//hashmap is working on hashing:hashcode
	//when the same hascode or different hashcode denoted to the same index number(behave like a linked list
	//amit|743230|100|null ->sumit|743230|200|null|->bijay|532332|300|null  same index no-4 this is called collisionhashmap
	//when it reached its threasold then liner operation o(N) convert into balanced binarary tree big o(logn)
	
	//key,hashcode,value,nextpointer
	//by defult 16 node is created first time
	public static void main(String[] args) {

		//put operations
		HashMap<String,Integer>  marks=new HashMap<>();
		      marks.put("Amit", 100);
		      marks.put("Sumit",200);
		      marks.put("bijay", 300);
		      marks.put(null,500);//hashcode for null value is zero then index is also 0 
		      //get operations
		      
		      marks.get("Amit");//hashcode-743230-> check 4 index-.equals method to check key
		      marks.get("sumit");
		      marks.get("bijay");
	}

}
