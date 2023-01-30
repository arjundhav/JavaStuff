package tut;

public class Hello {
	
	 int instanceVariable=10;
	 String greet; 
	 static int staticVariable=15;
	 
	 //constructor
	 public Hello() { 
		 this.greet= "Hello, Welcome to";
	 }
	 public void publicModifier() {
		 System.out.println("Public Modifier Test");
	 }
	 
	 private void privateModifier() {
		 int localvariable = 20;
		 System.out.println("Private Modifier Test & localVar is" +localvariable);

	 }
	 
	 protected void nonStaticTest() {
		 System.out.println("Non-static Test");
	 }
	 
	 public static void staticTest() {
		 System.out.println("Static Test");
	 }

	//  abstract void shape() {
    //     abstract float area;
	// 	//Basically these class doesnt have implemented
	//  }
	 

	 public static void main(String[] args){    //String[] args is for command line arguments.
		 System.out.println("Hello");
		 
		 Hello obj = new Hello();
		 obj.nonStaticTest();            //non static requires object for calling.
		 staticTest();                   //static method is called without object.
	     
		 obj.privateModifier();
		 obj.publicModifier();
		 
		 Hello obj1 = new Hello();
		 obj1.instanceVariable=25;
		 Hello obj2 = new Hello();
		 obj2.instanceVariable=35;
		 
		 
	 }
	 
	 
}

/*
   3 types of Variables:
    
    Instance Variable: It is at class level.
                       They are declared in class but outside method or any block
    Local Variable: Limited to method
    Static Variable: One per class. mostly used for constants
 
*/