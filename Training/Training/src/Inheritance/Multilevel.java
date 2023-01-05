package Inheritance;

public class Multilevel {
	 public static void main(String args[])
	 {
		//Assigning B object to B reference
		 B ob = new B();
		 ob.dispB();
		 ob.dispA();
		 
	   //Assigning C object to C reference
	    C ob1 = new C();
	    ob1.dispC();
	    ob1.dispA();
	    
	  //Assigning D object to D reference
	    D ob2 = new D(); 
	    ob2.dispD();
	    ob2.dispA();
	    
	 }
}
