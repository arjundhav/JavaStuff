package CollectionFramework;

import java.util.*;

public class ListDemo {

  public void stackDemo(){


      Stack<String> stack = new Stack<String>();
      stack.push("Ayush");
      stack.push("Garvit");
      stack.push("Amit");
      stack.push("Ashish");
      stack.push("Garima");
      stack.pop();

      Iterator<String> itr=stack.iterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
  }

  public static void main(String[] args) {

    // List is ordered collection of elements
    // List is indexed collectionc & can contain duplicate elements
    // List <data-type> list1= new ListType();  

    // List can only store String Objects
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("John");
    list1.add("Jennie");
    list1.add("Jack");
    list1.add("Joe");
    list1.add("Jim");
    // list1.add(10); Gives Error

    // List2 can store any type object
    ArrayList list2 = new ArrayList();

    list2.add("John");
    list2.add(10);
    list2.add(2.2);

    // print ref to list
    System.out.println(list1);
    System.out.println(list2);

    String name = list1.get(2);
    System.out.println("Get Name by index: " + name);

    // If we dont know the data type of element
    Object o = list2.get(2);
    System.out.println("Get Object by index: " + o);

    // Update Element in List
    list1.set(2, "Sia");
    System.out.println("Updated List : " + list1);

    // Remove Element from List
    list1.remove(2);
    System.out.println("Updated List after remove : " + list1);

    //To remove all elements : list1.clear();

    // Iterate Arraylist
    System.out.println("==== Iterating Arraylist ==== ");
    for (String str : list1) {
      System.out.println(str);
    }
    System.out.println("============================= \n");

    System.out.println("==== Iterating Arraylist using Iterator ==== ");
    Iterator<String> itr = list1.iterator();
    while (itr.hasNext()) {
      String str = itr.next();
      System.out.println(str);
    }
    System.out.println("============================================\n");
  }
}