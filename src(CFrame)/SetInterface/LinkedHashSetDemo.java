package SetInterface;

import java.util.*;

public class LinkedHashSetDemo {

	//Only difference between LinkedHashSet(No keys) and LinkedHashMap(has keys)
	
	//LinkedHashSet== It's growable in size, follow the order of insertion
	
	//HashSet== follow the sorted order
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		 LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
	        
	        lhs.add("A");
	        lhs.add("C");
	        lhs.add("E");
	        lhs.add("K");
	        lhs.add("B");
	        lhs.add("G");
	        lhs.add("B");//Since Set so Duplicates not allowed
	        
	       System.out.println(lhs);
	       
	       //With HasSet======= output: [A, B, C, E, G, K]  //Sorted
	       
	       //With LinkedHasSet======= output: [A, C, E, K, B, G]  //Order of insertion
	       
	       Iterator<String> itr = lhs.iterator();
	       
	       while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	       }
	}

}
