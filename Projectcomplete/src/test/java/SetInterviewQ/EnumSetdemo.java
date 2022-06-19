package SetInterviewQ;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetdemo {
  /* #it is much faster then hashset, it is not synchronized and not thread-safe
   * why it is faster because all the methods are implemented using bitwise airth metic operations*/
	enum Lang{
   	 JAVASCRIPT,
   	 PYTHON,
   	 JAVA,
   	 CSHARP,
   	 RUBY
    }
	
	public static void main(String[] args) {
     //created a new enumset using enum
		 EnumSet<Lang> langs= EnumSet.allOf(Lang.class);
		 System.out.println(langs);
		 //empty enum set:
		  EnumSet<Lang> emptyenum=EnumSet.noneOf(Lang.class);
		 System.out.println(emptyenum);
		 //range
		    EnumSet<Lang>  rangeenum= EnumSet.range(Lang.JAVASCRIPT,Lang.CSHARP);
		     System.out.println(rangeenum);
		     //singleEnum
		       EnumSet<Lang>  SingleEnum= EnumSet.of(Lang.RUBY);
		          System.out.println(SingleEnum);
		          //multipleeEnum
		          EnumSet<Lang> multiEnum=EnumSet.of(Lang.JAVA,Lang.PYTHON);
		          System.out.println(multiEnum);
		          //add and add all method
		          
		                      EnumSet<Lang> lang1= EnumSet.allOf(Lang.class);
		                      EnumSet<Lang> lang2=EnumSet.noneOf(Lang.class);
		                      lang2.add(Lang.JAVA);
		                      System.out.println(lang2);
		                      
		                      lang2.addAll(lang1);
		                      System.out.println(lang2);
		                    //using iterator
		                      Iterator<Lang> it= EnumSet.allOf(Lang.class).iterator();
		                      
		                      while(it.hasNext()) {
		                    	System.out.println(it.next());
		                      }
		                      System.out.println("=============");
		              boolean b=  lang2.remove(Lang.JAVA);
		              System.out.println(b);
		              System.out.println(lang2);
		              boolean c=  lang2.removeAll(lang2);
		              System.out.println(c);
		              System.out.println(lang2);
		                      
	}

}
