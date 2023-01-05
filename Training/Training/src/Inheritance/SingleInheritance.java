package Inheritance;

public class SingleInheritance {
	public static void main(String args[]) 
	{ 
	 B obj = new B(); //derived class object: Child obj=new Parent(); 
	 obj.dispA(); 
	 obj.dispB(); 
	 
	 //upcasting is always safe 
	 A obj1 = new B();
	 obj1.dispA();
	 
	 //downcasting can be risky
	 A obj2 = new B();  // Parent p = new Child();  
//	 B obj3 = new A();  // This implicit Downcating Child c = new Parent();it gives compile-time error   
	
	 //Explicit Downcasting
	 B obj3 = (B)obj2;  // Child c = (Child)p;   
	 obj3.dispB();
	} 
}
