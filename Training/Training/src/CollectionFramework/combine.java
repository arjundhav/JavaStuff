package CollectionFramework;

import java.util.*;

public class combine {
    
    /* 
        Type safe - same type of elements are added
        UnType Safe - diff type of elements are added

    */
    
    //Type safe collection
    List<String> names = new ArrayList<>();
    names.add("AJ");
    names.add("John");
    names.add("Arjun");
    names.add("Jack");
    System.out.println("Type safe collection: "+names);
    //System.out.println(names.get(0));
    names.remove("AJ");
    System.out.println("Updated Type safe collection: "+names);
    System.out.println("Is John in set: "+names.contains("John"));
    System.out.println("Size of set: "+names.size());


  /* //UnType safe collection
    List list = new LinkedList();
    list.add("AJ");
    list.add(1);
    list.add(1.0);
    list.add(true);
    System.out.println("UnType safe collection: "+list);
  */

    //Type safe collection
    Set<String> set = new HashSet<String>();
    set.add("John");
    set.add("Arjun");
    set.add("Jack");
    set.add("Tommy");
    set.add("Jim");
    System.out.println("Set of names: "+set+" \n");
    Iterator<String> itr = set.iterator();
    while(itr.hasNext()){
        String str = itr.next();
        System.out.println(str);
    }
    set.remove("John");
    System.out.println("Updated Set: "+set);
    System.out.println("Is Jim in set: "+set.contains("Jim"));
    System.out.println("Size of set: "+set.size());

    //Type safe Map collection
    Map<String,String> map = new HashMap<String,String>();
    map.put("1","AJ");
    map.put("2","John");
    map.put("3","Arjun");
    map.put("4","Jack");
    map.put("5","Tommy");
    map.put("6","Jim");
    System.out.println("Map of names: "+map+" \n");
    Iterator<String> itr1 = map.keySet().iterator();
    while(itr1.hasNext()){
        String str = itr1.next();
        System.out.println(str+" "+map.get(str));
    }
    map.remove("1");
    System.out.println("Updated Map: "+map);
    System.out.println("Is 2 in map: "+map.containsKey("2"));
    System.out.println("Size of map: "+map.size());


    //Type safe collection
    Queue<String> queue = new LinkedList<String>();
    queue.add("AJ");    
    queue.add("John");
    queue.add("Arjun");
    queue.add("Jim");
    System.out.println("Queue of names: "+queue+" \n");
    Iterator<String> itr2 = queue.iterator();
    while(itr2.hasNext()){
        String str = itr2.next();
        System.out.println(str);
    }
    queue.remove("AJ");
    System.out.println("Updated Queue: "+queue);
    System.out.println("Is Jim in queue: "+queue.contains("Jim"));
    System.out.println("Size of queue: "+queue.size());

}
