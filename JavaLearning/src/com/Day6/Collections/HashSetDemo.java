package com.Day6.Collections;
/*
HashSet is a class implementing Set interface
Heterogeneous data's are allowed
Insertion order is not maintained
Duplicates are not allowed
Multiple null values are not allowed but single null value is allowed
 */
/*
 * 1. Declaration
 * 2. Adding Elements
 * 3. Printing HashSet
 * 4. Printing size
 * 5. Remove specific value
 * 6. Inserting Element
 * 7. Accessing specific element
 * 8. Alternative method to access the specific element
 * 9. Read all the elements
 * 10. clear all elements
 * 11. check whether the hashset is empty
 */


import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Citrus Fruit");
		System.out.println(hs.size());
		System.out.println(hs);
		hs.remove("Citrus Fruit");
		System.out.println(hs);
		Set<String> fruits=new HashSet<>();
		fruits.add("Blueberry");
		fruits.add("Cherry");
		hs.addAll(fruits);
		System.out.println(hs);

		List<String> list=new ArrayList<>(hs);
		System.out.println(list.get(3));

		for(String fruit:hs){
			System.out.println(fruit);
		}

		Iterator<String> it=hs.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}
		
		
}