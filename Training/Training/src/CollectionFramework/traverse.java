package CollectionFramework;
import java.util.*;

public class traverse {
    List<String> names = new ArrayList<>();
    names.add("AJ");
    names.add("John");
    names.add("Arjun");
    names.add("Jack");
    System.out.println("Type safe collection: "+names);


    // for each item
    for(String name: names){
        System.out.println(name);
    }

    //iterator - forward traversing
    Iterator<String> itr = names.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }

    //iterator - backward traversing
    ListIterator<String> itr2 = names.listIterator(names.size());
    while(itr2.hasPrevious()){
        System.out.println(itr2.previous());
    }

    // enumeration - only for vector
    Vector<String> v = new Vector<>(names);
    Enumeration<String> e = v.elements();
    while(e.hasMoreElements()){
        System.out.println(e.nextElement());
    }

    // for each method
    names.forEach(e -> {
        System.out.println(e);
    });

    // Hashmap Traversing
    Map<String, String> map = new HashMap<>();
    map.put("1", "AJ");
    map.put("2", "John");
    map.put("3", "Arjun");
    map.put("4", "Jack");
    System.out.println("Map collection: "+map);

    // for each item
    map.forEach((k,v) ->{
        System.out.println(k+" => "+v);
    });


}


