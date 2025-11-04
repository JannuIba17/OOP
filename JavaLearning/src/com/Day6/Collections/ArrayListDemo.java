package com.Day6.Collections;
/*
ArrayList is a class implementing list interface
Heterogenous datas allowed
Insertion order is maintained
Multiple Duplicate values are allowed
Multiple null values are allowed
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 1. Declaration
 * 2. How to Add Data to ArrayList
 * 3. How to find the size of the ArrayList
 * 4. How to print ArrayList
 * 5. How to remove element in an ArrayList
 * 6. How to insert element at particular index
 * 7. How to modify/update element in the ArrayList
 * 8. How to access elements from ArrayList
 * 9. How to clear ArrayList
 * 10. How to check whether the ArrayList contains an element
 * 11. How to convert array to ArrayList and ArrayList to array
 */
public class ArrayListDemo {
	public static void main(String[] args) {
//		1. Declaration
		ArrayList list=new ArrayList<>();

//		* 2. How to Add Data to ArrayList
		list.add("Apple");
		list.add(101);
		list.add('C');
		list.add(true);
		list.add(null);
		list.add("Apple");
//		3. How to find the size of the ArrayList
		System.out.println(list.size());
//		How to print ArrayList
		System.out.println(list);
//		How to remove element in an ArrayList
//		list.remove(3);
//		list.remove("Apple");
//		System.out.println(list);
//		How to insert element at particular index
		list.add(3,"Orange");
		System.out.println(list);
//		How to modify/update element in the ArrayList
		list.set(4,false);
		System.out.println(list);
//		How to access elements from ArrayList
		System.out.println(list.get(5));
//		How to clear ArrayList
		list.clear();
		System.out.println(list);
//		How to check whether the ArrayList contains an element
		System.out.println(list.isEmpty());
		Integer[] array=new Integer[]{1,2,3,4,5};
		List<Integer> list1=new ArrayList<>(Arrays.asList(array));
		System.out.println(list1);

//		Traversal Techniques
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		for(Integer temp:list1){
	 		System.out.println(temp);
		}
		System.out.println("------------------");
		Iterator<Integer> it=list1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
