package CollectionFramework;

import java.util.*;

public class MapDemo {

    public static void main(String args[]) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        // Elements can traverse in any order
        // Returns a Set view of the mappings contained in this map 
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }

}
/*
 * Map contains values on the basis of key, i.e. key and value pair. Each key
 * and value pair is known as an entry.
 * A Map contains unique keys.
 * It is used to search, update or delete elements on the basis of a key.
 */