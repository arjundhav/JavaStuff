package com.tut;
import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {

        // String literals are stored in String Pool
        String str = "Hello"; // String Literals
        String str1 = "Hello";

        // We are Comparing Hashcodes in both strings
        if (str == str1) {
            System.out.println("Equal in String Pool");
        } else {
            System.out.println("Not Equal");
        }

        // string obj constructed in Heap with Hello as content
        // constructed in heap area
        String str2 = new String("Hello");
        String str3 = new String("Hello");

        // We are Comparing Hashcodes in both strings
        // == will compare ref.variables & not real content
        if (str2 == str3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal in Heap");
        }

        // Way to compare strings
        if (str2.equals(str3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // String methods
        String s = "John,Jennie,Jack,Joe";
        System.out.println(s);

        int len = s.length();
        System.out.println("Length is: " + len);
        System.out.println("Char at start is: " + s.charAt(0) + "\nChar at end: " + s.charAt(len - 1));

        System.out.println("str to uppercase: " + s.toUpperCase());
        System.out.println("str to lowercase: " + s.toLowerCase());

        if (s.contains("Joe")) {
            System.out.println("Joe is in the string");
        } else {
            System.out.println("Joe is not in the string");
        }

        String s2 = s.substring(5);
        System.out.println("Substring is: " + s2);

        String s3 = s.substring(5, 10);
        System.out.println("Second Substring is : " + s3);

        String s4 = s.replace('e', 'a');
        System.out.println("Replaced String: " + s4);

        char[] ch = s.toCharArray();
        System.out.println("Char Array of S: " + Arrays.toString(ch));

        String[] strArr = s.split(",") ;
        System.out.println("String Array of S: " + Arrays.toString(strArr));

        String email = "arjundhav@gmail.com";
        String phone ="7777568926";
            
      //Validate data from user  
        if(!email.isEmpty() && email.contains("@") && email.contains(".")){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
            
        if(!phone.isEmpty() && phone.length()==10){
            System.out.println("Valid Phone");
        }else{
            System.out.println("Invalid Phone");
        }

       // String is immutable whereas StringBuffer and StringBuilder are mutable classes.
       //String buffers are safe for use by multiple threads.
       StringBuffer buffer =new StringBuffer("Hello"); //Thread Safe
         buffer.append(" World");
         System.out.println("Buffer is: "+ buffer);
       
       // String Builder class used to create a mutable, or  modifiable arrof characters
       // StringBuilder is faster than StringBuffer
       StringBuilder builder = new StringBuilder("Hello"); //Not Thread Safe
        builder.append(" Arjun");
        System.out.println("Builder is: "+ builder);

      





}      
}
