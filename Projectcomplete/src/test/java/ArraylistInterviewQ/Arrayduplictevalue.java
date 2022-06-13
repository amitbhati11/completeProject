package ArraylistInterviewQ;

public class Arrayduplictevalue {

	public static void main(String[] args) {
		Integer n[] =new Integer[5];
	     n[0]= 2;
	     n[1]= 3;
	    		 
	    		 n[2]= 2;
	    				 n[3]= 4;
	    						 n[4]= 5;
	     
	
	for(int i=0;i<n.length-1;i++) {
		for(int j=i+1;j<n.length;j++) {
			if(n[i]==n[j]) {
				System.out.println(n[i]);
			}
		}
	}
		
	}
}


