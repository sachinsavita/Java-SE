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
	       HashSet<String> hs = new HashSet<>();
	       Iterator<String> itr = lhs.iterator();
	       
	       for(String s : lhs)
	       {
	    	   hs.add(s);
	    	  
	       }
	      
	       System.out.println(hs);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void insert(LinkedHashSet<Integer> s, int x)
    {
	// Your code here
	s.add(x);
    }
	
    /*prints the contents of the set s in ascending order */
    void print_Contents_Increasing_Order(LinkedHashSet<Integer> s)
    {
	// Your code here
	HashSet<Integer> hs = new HashSet<>();
	for(Integer i : s)
	       {
	    	   hs.add(i);
	       }
	       for(Integer r : hs)
	       {
	    	   System.out.print(r+" ");
	       }
	
    }

     /*prints the contents of the set s in ascending order */
    void print_Contents_Insertion_Order(LinkedHashSet<Integer> s)
    {
	// Your code here
	for(Integer p : s)
	       {
	    	   System.out.print(p+" ");
	       }
    }
	
    /*erases an element x from the set s */	
    void erase(LinkedHashSet<Integer> s, int x)
    {
	// Your code here
	s.remove(x);
    }
	
    /*returns the size of the set s */
    int size(LinkedHashSet<Integer> s)
    {
        // Your code here
        return s.size();
    }
		
    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(LinkedHashSet<Integer> s, int x)
    {
	// Your code here	
	if(s.contains(x))
	return 1;
	else return -1;
    }

}
