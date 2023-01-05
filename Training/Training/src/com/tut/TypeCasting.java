package com.tut;

public class TypeCasting {

	 void implicit() {
		
		 int num = 10;
		 System.out.println("The integer value: " + num);

		// convert into double type
		 double data = num;
		 System.out.println("The double value implicit typecasted : " + data + "\n");
	 }
	 
	 void explicit() {
		 double num = 10.99;
		 System.out.println("The double value: " + num);

		 // convert into int type
		 int data = (int)num;
		 System.out.println("The integer value explicit typecasted : " + data  + "\n");
	 }
	 
	 public static void main(String[] args) {
		 TypeCasting ob = new TypeCasting();
		 ob.implicit();
		 ob.explicit();
		 
		//Implicit type conversion
		    char c = 'c';
			int x = c; // char to string
			System.out.println("Value of x: " + x+'\t');
			
			float f = c; //char to float
			System.out.println("Value of f: " + f +'\t' );
			
			long ll = c; //char to long
			System.out.println("Value of ll " + ll + '\t');
			
			double d =c;  //char to double
			System.out.println("Value of d " + d + '\t');
			
	      /*char z = d; //double to char gives an error
	     	System.out.println("Value of z " + z); */
			String str = "Arjun";
			int i = 10;
			
			String p = i +" roll no " + str; //int & string combined
			System.out.println("After Conversion value p: "+ p);
			
	    // Explicit Conversions uses Type casting
			int q = (int)d; //Double to int explicit conversion 
			System.out.print("After Conversion value q: "+ q+'\n');
			
			//string to int: Integer.parseInt()
			String con = "2345";
			int num = Integer.parseInt(con);
			System.out.print("After Conversion value num: "+ num+'\n');
					
			//string into int: Integer.valueOf()
			int no = Integer.valueOf(con);
			System.out.print("After Conversion value no: "+ no+'\n');
			
			//int to string: Integer.toString() OR String.valueOf()
			int id = 413;
			String word = Integer.toString(id);
			System.out.println("After Conversion value word: "+ word+" \n");
	 }
	 
}
