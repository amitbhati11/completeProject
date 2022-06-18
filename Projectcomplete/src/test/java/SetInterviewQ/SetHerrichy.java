package SetInterviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHerrichy {

	//Collection(I)->Set->SortedSet(i)->hashsetclass->extends linkedhashset jdk 1.4
	//Collection(I)->Set-->Abstractset class->extends i.Tree set- ii. enum set jdk1.5 iii.CopyOnWriteArraySet
	//set is care about uniqueness. not allow duplicate value,null value accept
	//working on hashing concept
	public static void main(String[] args) {
               Set<String> hs=new HashSet<>();
               
               hs.add("alpha");
               hs.add("beta");
               hs.add("gamma");
               hs.add("alpha");//only unique value
               hs.add(null);
               System.out.println(hs);
               //contain method
                 System.out.println(hs.contains("gamma"));
                 //remove method
                 hs.remove("beta");
                 System.out.println(hs);
                 System.out.println("==========");
                 //#iterator
                 Iterator it=hs.iterator();
                 while(it.hasNext()) {
                	 System.out.println(it.next());
                 }
                 
                 //union from set(add all)
                 Set<Integer> first=new HashSet<>();
                 first.addAll(Arrays.asList(new Integer [] {1,3,4,8,9,6,0,7}));
                 
                 Set<Integer> second=new HashSet<>();
                 second.addAll(Arrays.asList(new Integer [] {10,2,3,4,8,9,6,5}));
               
                 Set<Integer> union=new HashSet<>(second);
                 union.addAll(first);
                 System.out.println(union);
                 
                 //intersection (common)
                 Set<Integer> intersection=new HashSet<>(second);
                 intersection.retainAll(first);
                 System.out.println(intersection);
                 //difffernce
                 Set<Integer> diff=new HashSet<>(second);
                 diff.removeAll(first);
                 System.out.println(diff);
                 
                 
	}

}
