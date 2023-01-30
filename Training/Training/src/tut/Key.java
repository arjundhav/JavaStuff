package tut;

import java.util.*;

public class Key {
	
   String n;
 
   //Constructor
   public Key(){
	 this("Unlock the Lock using Pass !!! \\n");
	 }
	
	//Parameterized Constructor 
	public Key(String n) {
      this.n="Welcome to KEY-Lock Tut !!! \\n";
	}

	Scanner in = new Scanner(System.in);  // Create a Scanner object
	
	public void account() {
   		     
		     System.out.print("Enter username: ");
		     String userName = in.nextLine();  // Read user input
		    
		     System.out.println("Enter Password: ");
			 String password = in.nextLine();  // Read user input
			 
			 System.out.println(n+ "Username : " + userName+ "\t" + "Password : " + password);  // Output user input
	}
	
	public static void success() {
		
		System.out.print(" \n Account Created !!!! ");
	}
	
	public static void main(String[] args) {
       
       Key k =new Key();
       k.account();
       Key.success();   //for static method
       
	}

}

/*

   this keyword: 
       - used as reference variable of current object
       -Is used to invoke current class construtor,method
       -it is passed as an arg in constructor call or method call      

*/