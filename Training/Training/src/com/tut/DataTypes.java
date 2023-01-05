package com.tut;

public class DataTypes {
	
	// 2 types of Type Conversions : Implicit & Explicit
	
	public static void main(String[] args){
		
		byte a = 5;               // 1 byte
		int i = 10;              // 4 byte
		char c = 'c';           // 2 byte
		float k = 234.1f;      // 4 byte
		long l = 10001054L;   // 8 byte
		double m =14.01 ;    // 8 byte
		short n = 100;      // 2 byte 
		boolean j = true;  // 1 bit
		
		String str = "Arjun";  // Non-primitive/Reference DataType holds bit that gives a way to access an object.
		
	//Operators
		int op = 20;
		int op2 = 10;
		
		int left = op<<2; 
		/* 20 - 10100 
		  shift by 2 positions on left
		  1010000 = 64+16 =80
		 */
		int right = op>>2;
		/*
		 20 - 10100
		 shift by 2 positions from right
		 00101 = 5  
		*/
		System.out.println("LeftShift op:"+left);
		System.out.println("RightShift op:"+right);
		
		//ternary Operator condition?if:else 
		boolean ter = op<op2?true:false;
		System.out.println("Condition is : "+ter);
				
	}

}

/*

 #Types of Operators
  
     Unary  :  post-fix: a++,a-- 
               prefix: ++a,--a
          
     Arithmetic : +,-,*,/,%
  
     Relational : < ,> ,<= ,>= ,== ,!=
  
     Logical : && ,||        
  
     Assignment : =, +=, -=, /=, %= 
     
 */