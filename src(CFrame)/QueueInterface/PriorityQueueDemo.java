package QueueInterface;

import java.util.*;

//Comparator
class MyLargerComp implements Comparator<Integer>
{
	
		public int compare(Integer o1, Integer o2)
		{
			if(o1<o2) return 1;
			if(o1>o2) return -1;
			return 0;
		}
}

class MySmallerComp implements Comparator<Integer>
{
	
		public int compare(Integer o1, Integer o2)
		{
			if(o1>o2) return 1;
			if(o1<o2) return -1;
			return 0;
		}
}
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq= new PriorityQueue<>(new MySmallerComp());  //Made two comparator 1. for min value(MySmallerComp)    2. for max value(MyLargerComp)                 

		//Properties
		/*It act according to the priority set by comparator 
		 * if it is set to smallest first then every time it will pop out smallest element of the queue
		 * and if it is set to largest element it will pop out largest element of the queue*/
		
		//The priority according to the integer if smaller number has the highest priority then smallest will pop out first
		//if larger number has the highest priority then larger will pop out first
		
//		1. Act like Heap
//		2. If minimum heap then first element will be smallest
//		3. If maximum heap then first element will be largest
		
		/*so when we pop out elements it gives the root node element smallest or largest and also make the next
		smallest or largest element root node.*/
		
		pq.offer(100);  //offer and add method are same
		pq.add(200);
		pq.add(300);
		System.out.println(pq.peek());// smaller is 100 until now
		pq.add(400);
		pq.add(4);
		System.out.println(pq.peek());//// Now smaller is 4 among the queue element
		pq.add(500);
		
		pq.add(50);
		pq.offer(600);
		System.out.println(pq);
		
		pq.remove(); //remove the smallest element which is 4
		pq.remove(); //now remove the next smallest element which is 100
//		pq.remove(); //now remove the next smallest element which is 200
		System.out.println(pq);
		
		
		
	}

}
