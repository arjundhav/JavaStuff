package CollectionFramework;

import java.util.*;

public class MapDemo {

    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(103,"Arjun");


        // Elements can traverse in any order
        // Returns a Set view of the mappings contained in this map 
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Map map1=new HashMap(); 
        map1.putAll(map);   // new_hash_map.putAll(hash_map);
        System.out.println("Invoking putAll() method:"+map1);

        map.remove(100);    // Removes the mapping for the specified key from this map if present
        System.out.println("Invoking remove() method:"+map);

        map.replace(101, "Vijay", "Ravi");  // Replaces the entry for the specified key only if currently mapped to the specified value
        System.out.println("Invoking replace() method:"+map);

        map.keySet();
        System.out.println("Invoking keySet() method:"+map.keySet());

        map1.clear();
        System.out.println("Invoking clear() method:"+map1);

        map1.size();
        System.out.println("Invoking size() method:"+map.size());
        
    }

}
/*
 * Map contains values on the basis of key, i.e. key and value pair. Each key
 * and value pair is known as an entry.
 * A Map contains unique keys.
 * It is used to search, update or delete elements on the basis of a key.
 */