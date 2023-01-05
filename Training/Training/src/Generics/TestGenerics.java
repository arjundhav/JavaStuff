package Generics;

import java.util.*;

public class TestGenerics {

	  public static <E> void printArray(E[] elements) {
		   for(E element: elements){
			   System.out.println(element);
		   }
		  System.out.println();
	   }

	   public static void main(String args[]) {
		
		 Integer[] intArray = {10,20,30,40,50};
		 Character charArray[] = {'J','A','V','A','P','O','I','N','T'};

         System.out.println("Printing Integer Array");
	     printArray(intArray);

	     System.out.println("Printing Character Array");
	     printArray(charArray);	
 		}
 } 

/*

   Generic Class: There can be more than one types of parameter, separated by a comma.
   
    syntax: BaseType <Type> obj = new BaseType <Type>()




*/