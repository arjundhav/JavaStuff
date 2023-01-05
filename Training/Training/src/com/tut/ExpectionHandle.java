package com.tut;

import java.io.*;

public class ExpectionHandle {

	public int uncheckedE() {
		
  /* Here we are dividing by 0 which will not be caught at compile time
     as there is no mistake but caught at runtime because it is mathematically incorrect*/
		try{
			int x = 0;
			int y = 10;
			int z = y / x;
			
			return z;
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero not possible");
		}
		return 0;
		
	    
		
	}
	
	public void checkedE() {
		
		FileInputStream fin = null;
		try{
		    fin = new FileInputStream("B:/myfile.txt"); 
		}catch(FileNotFoundException fe){
	            System.out.println("The specified file is not " +
				"present at the given path");
		 }
		int k; 
		try{
		    while(( k = fin.read() ) != -1) 
		    { 
			System.out.print((char)k); 
		    } 
		    fin.close(); 
		}catch(IOException ioe){
		    System.out.println("I/O error occurred: "+ioe);
		 }
	  }
    
	 public void eTest() {
		 int a[] = new int[2];
	      try {
	         System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown :" + e);
	      } finally {
	         a[0] = 6;
	         System.out.println("First element value: " + a[0]);
	         System.out.println("The finally statement is executed");
	      }
	 }
	 
	
	public static void main(String[] args) {
		ExpectionHandle e = new ExpectionHandle();
		//e.uncheckedE();
		//e.checkedE();
		e.eTest();

	}

}

/*
 - Exception Handling in Java is mechanism to handle the runtime errors so that the normal flow of the app is maintained.
   - Types: 
           Checked   - CompileTime exceptions handle exception using try-catch block
           Unchecked - RunTime exceptions which wont give compileError 
           Error     - Error is irrecoverable. Ex: OutOfMemoryError,
           
   - A finally block of code always executes, irrespective of occurrence of an Exception. 
           
*/