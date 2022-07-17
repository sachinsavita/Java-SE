package QueueInterface;

import java.util.*;

public class ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Deletion from front and insertion from last -- Queue
		//Deletion and insertion from same end -- Stack
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
//		ad.addLast(5);
//		ad.offerLast(10);
//		ad.offerLast(15);
//		ad.offerLast(18);
//		ad.pollLast();
		System.out.println(ad);//Deleting from last
		
		ad.offerFirst(1);  //Adding at first (@index 0) and shifting other elements
		ad.offerFirst(2);  //Adding at first (@index 0)
		ad.offerFirst(3);  //Adding at first (@index 0)
		ad.offerFirst(4);  //Adding at first (@index 0)
		ad.pollFirst();
		System.out.println(ad);//Deleting from front
		
		
		//NOTE==== If inserting from first and deleting from first == It's a Stack
		
		//NOTE==== If inserting from last and deleting from first == It's a Queue
		
		//NOTE==== If inserting and deleting from both first and last == It's a Dequeue
	}

}
