package ListInterface;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al1 = new ArrayList<>(); //Size can be defines as =new ArrayList<>(20);
		ArrayList<Integer> al2 = new ArrayList<>(List.of(7,8,9,2,3,5,1)); //Adding the elements while creating object
		
		al1.add(2); //Adding element in al1 ArrayList at 0 index since no other element
		
		al1.add(0,5); //This will add element at 0 index and shift already exists element towards right
		
	    al1.addAll(al2);  //This will add all the elements of al2 in al1 after the element of al1
	    System.out.println(al1);
	    Collections.reverse(al1);
	    System.out.print(al1);
		al1.addAll(0,al2);  //This will add all elements of al2 into al1 from index 0
		System.out.println(al1);
		System.out.println(al1.contains(8));  //This will check whether the element present or not
		
		System.out.println(al1.get(9));  //Gave the index and it will return element at a given index
		
		System.out.println(al1.indexOf(8)); //It will return index of a given element
		
		System.out.println(al1.remove(8));  //Give index and remove element and return the element as well
		
		al1.set(1, 800);   //It will replace the element at a given index
		System.out.println(al1); 
	
//To print all the elements
		
		//Using for loop and get method
		for(int i=0;i<al2.size();i++)
		{
			System.out.print(al2.get(i)+" ");
		}
		
		
		//Using for each loop
		System.out.println();
		for(Integer i : al2)     //Also we can write like (var i : al2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Using Iterator
		 Iterator<Integer> it = al2.iterator();  //It is Uni-directional
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("Hello");
		//Using ListIterator
         ListIterator<Integer> lit = al2.listIterator(); //It is Bi-directional
		 
		 while(lit.hasNext())
		 {
			 System.out.println(lit.next());
		 }
		 
		 System.out.println("Converting while loop into a for loop");
		 //Converting while loop into a for loop
         for(ListIterator<Integer> li= al2.listIterator();li.hasNext();)
		 {
			 System.out.println(li.next());
		 }
         System.out.println("Using forEach with lembda expression");
         //Using forEach with lembda expression
         al2.forEach(n->System.out.println(n));
         
         System.out.println("changed expression");
         al2.forEach(System.out::println);
		 
         System.out.println("Calling Show method");
         al2.forEach(n->show(n));
         
         
         
         
		
	}

       static void show(int n) {
		if(n>6)
		{
			System.out.println(n);
		}
	}

}
