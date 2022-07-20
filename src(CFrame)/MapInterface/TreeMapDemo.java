package MapInterface;


import java.util.*;
import java.util.Map.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		
		      //key     value
       TreeMap<Integer,String> tm=new TreeMap<>(Map.of(100,"A",101,"B",102,"C",103,"D")); //Map.of     key and value pair
        //TreeMap is sorted map 

        tm.put(104,"E");
        tm.put(150,"F");
       
        System.out.println(tm.ceilingKey(130));//give key will return key if present otherwise next bigger key if present otherwise null
        System.out.println(tm.ceilingEntry(103));//give key will return key with value, greater than or equal to the given ke
        System.out.println(tm.get(104));//give key will return value
        
        Entry<Integer, String> e = tm.lastEntry();//return last key and values
        Entry<Integer, String> ef = tm.firstEntry();//return first key and values
        
        System.out.println(ef.getKey()+" "+ef.getValue()); //Will fetch key and value
        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm);
	}

}
