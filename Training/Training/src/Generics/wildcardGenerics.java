package Generics;

import java.util.*;

public class wildcardGenerics {
    
	private static Double sum(List<? extends Number>list){
		double sum=0.0;
		for (Number n:list) {
         sum += n.doubleValue(); }
	    return sum;
	}
	
	public static void printIntClassorSuperClass(
		List<? super Integer> list){
			System.out.println(list);
		}
	
	private static void printlist(List<?> list) {
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		
		// Upper Bounded Integer List
		System.out.println("Upper bounded List");
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
		System.out.println("Total sum is:" + sum(list1)); //sum of elements in list
		// Double list
		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
		System.out.print("Total sum is:" + sum(list2));	
		
		
		// Lower Bounded Integer List
		System.out.println("Lower bounded List");
		List<Integer> list3 = Arrays.asList(4, 5, 6, 7);
		printIntClassorSuperClass(list3); //Int list object passed
		// Number list
		List<Number> list4 = Arrays.asList(4, 5, 6, 7);
		printIntClassorSuperClass(list4); //Int list object passed
		
		//UnBounded Int list
		List<Integer> list5 = Arrays.asList(1, 2, 3);
		List<Double> list6 = Arrays.asList(1.1, 2.2, 3.3); //double list 
		System.out.println("Unbounded List");
		printlist(list5);
		printlist(list6);
	}
}

/*
 Wildcard: The question mark (?) is known as the wildcard in generics.
    - Represents unknown type 
    - It has 2 types:
       i) Upper bounded Wildcards: To write a method that works on List < Integer >, List < Double >, and List < Number>
            syntax: public static void add(List<? extends Number> list)  
            
            
       ii) Lower bounded Wildcards: represented with '?' followed by the super keyword, followed by its lower bound: <? super A>. 
            restrict the unknown type to be a supertype of that type..    
            syntax: Collectiontype <? super A>
          
      iii) Unbounded Wildcards: Represented with '?', for ex: List. 
              This is called a list of unknown types.   

*/

