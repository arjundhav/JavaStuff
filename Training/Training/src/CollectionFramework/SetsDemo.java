package CollectionFramework;

import java.util.*;

public class SetsDemo {
    
    enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
  
    public static void enumSet(){
        EnumSet<Days> set = EnumSet.of(Days.MONDAY, Days.TUESDAY);
        System.out.println("EnumSet: "+set);
    }

    public static void main(String[] args) {
     
        HashSet<String> set = new HashSet<String>();
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

        SetsDemo.enumSet();
    }
}

/*  
           Set is mainly used for mathematical set abstraction
           It's collection that cannot contain duplicate elements.
           It's unordered & not indexed collection.
           HashSet & LinkedHashSet are faster than TreeSet

           Hashset - uses hashing technique for storage 
           LinkedHashSet - maintains insertion orderS
           TreeSet - Unique & sorted version of set 
         
*/