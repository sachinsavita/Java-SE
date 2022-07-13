package MapInterface;

import java.util.*;

public class HashTableDemo {// foloow key value

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht0 = new Hashtable<>();
		Hashtable<Integer, String> ht = new Hashtable<>();//Implements Map class

		
		   //key, "value"
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");

		Enumeration e = ht.elements();// Used to trace all the elements
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		ht.compute(2, (k,v)->v+"J");//It will concatenate B with J
		
		ht.computeIfAbsent(7, (k) -> "Z");//It will add the element in the table only if the key is not present
		
		ht.computeIfPresent(4, (k,v)->v+"CL");//If present it will concatenate D with CL
		System.out.println(ht);

	}

}
