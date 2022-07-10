package MapInterface;

import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HashMap<Integer,String> tm=new HashMap<>(Map.of(100,"A",101,"B",102,"C",103,"D")); //Map.of 
        //HashMap is not sorted map

        tm.put(104,"E");
        tm.put(150,"F");
       
        
        //Below methods not present in HashMap
        
//        System.out.println(tm.ceilingKey(130));//give key will return key if present otherwise next bigger key if present otherwise null
//        System.out.println(tm.ceilingEntry(103));//give key will return key with value
//        System.out.println(tm.get(104));//give key will return value
//        
//        Entry<Integer, String> e = tm.lastEntry();//return last key and values
//        Entry<Integer, String> ef = tm.firstEntry();//return first key and values
//        
//        System.out.println(ef.getKey()+" "+ef.getValue());
//        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm);
	}

}
