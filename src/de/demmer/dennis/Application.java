package de.demmer.dennis;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Application {
	
	public static void main(String[] args) {
		
		//List
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		

		//Set
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
//		System.out.println(mySet.size());
		

		
		//Map
		// Key, Value
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(235, "Vogel");
		myMap.put(235, "Hund");
		
		
		//Queue
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		queue.offer(2);

		int j = queue.poll();
		
		
		
		
		//------------------------------------------
		
		//List
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(6);
		
		
//		//for-each
//		for(Integer k  : list) {
//			System.out.println(k);			
//		}
//
//		//for
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
		//Set
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(1);
		set.add(5);
		set.add(4);
		set.add(6);
		
		//oder
		set.addAll(list);

		for(Integer k : set) {
			System.out.println(k);
		}

		// Map 
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,"Eins");
		map.put(1, "Eins");
		map.put(5, "Fünf");
		map.put(4, "Vier");
		map.put(6, "Sechs");
		
	
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		
		for(Entry<Integer,String> e : entrySet) {
			System.out.println(e.getKey() + " | " + e.getValue());
		}
		

	}

}
