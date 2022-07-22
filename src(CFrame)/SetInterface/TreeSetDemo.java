package SetInterface;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50,60, 70, 10, 40));

		Collection<Integer> cs = new TreeSet<>(List.of(10, 30, 50,60, 70, 10, 40)); //If we use reference of Collection we can't use methods of TreeSet
		
		System.out.println(ts); // Remove duplicates 10
		
		ts.add(25);

		System.out.println(ts.contains(50));//search present or not
		
		System.out.println(ts.ceiling(72 ));  //It will return the number if present otherwise it will return next bigger number in set

		System.out.println(ts);
		int count = 0;
		for(int t : ts)
		{
			count++;
		}
		System.out.println(ts);
		Object[] arr = ts.toArray();
	
		System.out.println(arr[2]);
		System.out.println("check");
		for(Object t : arr)
		{
			System.out.print(t+" ");
		}
		System.out.println("hi");
		
		
		
		
	}

}
