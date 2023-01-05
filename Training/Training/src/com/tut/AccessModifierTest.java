package com.tut;

public class AccessModifierTest {

/*	
    final int i = 10;
	
	public void test(){
	 i = 11;  //we can't change final var it is just like const
	}
*/	
	private static void display() {
		System.out.println("Static Function"+"\n");
	}
	public static void main(String[] args){
		
		AccessModifierTest.display();
		
		Hello obj = new Hello();
		obj.publicModifier();  //public is visible anywhere in program.
		obj.nonStaticTest();  // visible within package (i.e same class & derived)
      //obj.privateModifier(); //private is visible only within class
	}

}

//Non Access Modifiers
/*
  static = we dont need to create object to call static function.
          - once a value is assigned to static var it fixed value & memory.
          
  final = finalize implementation
  
  synchronized & volatile = used for threads one at a time
  
  abstract = create abstract class and methods
     It is a class designed with implementation gaps for subclasses to fill in and is incomplete.

*/
