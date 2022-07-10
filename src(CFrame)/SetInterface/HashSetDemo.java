package SetInterface;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<>(20, 0.25f);  //where 20 is capacity and 0.25f is loading factor
		hs.add(20);
		hs.add(30);
		hs.add(20);//will not enter because HashSet will not add duplicate value
		hs.add(10);
		hs.add(60);
		
		System.out.println(hs);   //see elements are not stored as inserted they are here and there
		
		//Use of this if you want insertion and deletion in constant time 
		//Use loading factor precisely to avoid wastage of memory
		
		//More you decrease the loading factor space will reduce and Insertion and deletion time will increase
		//More you Increase the loading factor space will increase and Insertion and deletion time will decrease
	}

}
