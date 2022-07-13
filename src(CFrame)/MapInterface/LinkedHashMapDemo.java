package MapInterface;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                                                                //true represent here Order of access , false will represent Order of Insertion
		LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>(5, 0.50f,true) {
			                                                      //loading factor (0.50f)
			protected boolean removeEldestEntry(Map.Entry e)
			{
				return size()>5;
			}
		}; 
		
		LHM.put(12, "A");
		LHM.put(17, "B");
		LHM.put(14, "C");
		LHM.put(24, "D");
		LHM.put(28, "E");

//		LHM.put(23, "G");
//		LHM.put(26, "H");
//		LHM.put(29, "I");
		
		LHM.forEach((k,v)->System.out.println(k+" "+v)); //Showing in same order as inserted
		
		//Notice we assigned the capacity 5 but as we are inserting more and more it is growing
		 
		System.out.println(LHM.get(24));//return D
		String s=LHM.get(12);
		System.out.println(s);//return A	
		
		//Printing element according to the Order of access
		LHM.forEach((k,v)->System.out.println(k+" "+v));
		//It is showing elements first least accessing elements the recently access elements
		
		/*output:
			17 B
			14 C
			28 E
			24 D
			12 A*/
		
		//If want to constrain the LHM to the capacity
		//You have to override the method
		System.out.println("Following order of access or Order of insertion for deletion");
		LHM.put(22, "F"); //It will remove Least Recently Used element which is (17 , B)
		LHM.put(32, "G"); //It will remove Least Recently Used element which is (14 , C)
		LHM.forEach((k,v)->System.out.println(k+" "+v));
		
		/*output:
		 * 28 E
           24 D
           12 A
           22 F
32 G*/
System.out.println("===========================================================================================================");		 
	                                                            //Changed this to false Now it will remove element according to the order of insertion
LinkedHashMap<Integer, String> LH = new LinkedHashMap<>(5, 0.50f,false) {
			
			protected boolean removeEldestEntry(Map.Entry e)
			{
				return size()>5;
			}
		};
		
		
		LH.put(12, "A");
		LH.put(17, "B");
		LH.put(14, "C");
		LH.put(24, "D");
		LH.put(28, "E");

		LH.forEach((k,v)->System.out.println(k+" "+v));
		//Notice we assigned the capacity 5 but as we are inserting more and more it is growing, to stop growing we have override the method removeEldestEntry()
		 
		System.out.println(LH.get(24));//return D
		String s1=LH.get(12);
		System.out.println(s1);//return A	
		
		
		LH.put(22, "F"); //It will remove Least Recently Used element which is (12 , A)
		LH.put(32, "G"); //It will remove Least Recently Used element which is (17 , B)
		//Printing element according to the Order of Insertion
		LH.forEach((k,v)->System.out.println(k+" "+v));
		
		
	}

}
