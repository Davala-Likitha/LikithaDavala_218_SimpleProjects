package com40;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map {

	public class Entry {

	}

	public static void main(String[] args) {
		
		
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"jony");    
		      hm.put(2,"kittu");    
		      hm.put(3,"pinky");   
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(java.util.Map.Entry<Integer, String> m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"medha");  
		      ht.put(5,"Rosy");  
		      ht.put(6,"Jack");  
		      ht.put(7,"John");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(java.util.Map.Entry<Integer, String> n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Annie");    
		      map.put(9,"jessy");    
		      map.put(10,"Catie");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(java.util.Map.Entry<Integer, String> l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    


	}
}

	
