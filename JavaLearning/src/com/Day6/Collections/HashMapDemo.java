package com.Day6.Collections;



/*
 * 1. Declaration
 * 2. Adding pairs
 * 3. Finding size of hashmap
 * 4. Remove pairs
 * 5. Accessing value through key
 * 6. Retrieve All keys from HashMap
 * 7. Retrieve All values from HashMap
 * 8. Retrieve All keys along with values from HashMap
 * 9. Reading all data from HashMap
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Hashmap is a class implementing Map interface
We will store data's inside hashmap as key-value pair
Key should not be duplicated
Value can contain duplicates
Insertion order is not maintained
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(101,"Apple");
        hm.put(102,"Orange");
        hm.put(103,"Banana");
        hm.put(104,"Pineapple");
        System.out.println(hm);
        System.out.println(hm.size());
        hm.remove(102);
        System.out.println(hm);
        System.out.println(hm.get(104));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        for(int key:hm.keySet()){
            System.out.println(hm.get(key));
        }
        Iterator<Map.Entry<Integer,String>>it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> pair=it.next();
            System.out.println(pair.getKey()+"->"+pair.getValue());
        }
    }
}