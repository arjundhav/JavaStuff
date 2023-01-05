package com.tut;

public class Control {

	int num1=200;
	public int add(int num1,int num2){
		int sum = num1+num2;
		return sum;
	}
	
	public int add(int num1,int num2,int num3){
		int sum = num1+num2+num3;
		return sum;
	}
	
	public static void main(String[] args){
	    Control cal = new Control();
	    int sum = cal.add(10,30);
	    System.out.println("Sum is:  "+sum);
	    
     // Call by value
	    int num1 = 100;
	    int num2 = 30;
	    int num3 = 20;
	    Control cal2 = new Control();
	    System.out.println("before adding: "+num1);
	    int sum2=cal2.add(num1,num2);
	    System.out.println("After: "+sum2);
	    
	  //Overloaded add method which has 3args 
	    int sum3 = cal2.add(num1,num2,num3);
	    System.out.println("Overloading function sum: "+sum3);
	}
}

/*
   Call by value: If we call method by passing a value, it is known as call by value. 
   Method Overloading: multiple methods with same name but diff parameters & args
   Method Overidding : multiple methods with same name,parameters & args.
 */