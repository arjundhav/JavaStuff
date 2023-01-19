package tut;
import java.util.*;

public class ControlState {
	
	Scanner in = new Scanner(System.in);
	
	 public void showResult(){
		 
      //if else if ladder statement
         float p;	 
		 System.out.print("Enter your Percentage : ");
		 p = in.nextFloat();
		 System.out.print("Result : ");
		 
		 if(p>=60) {
				System.out.println("First div");
			} else if(p>=45){
				System.out.println("Second Div");
			} else if(p>=35){
				System.out.println("Third Div");
			} else {
				System.out.println("Fail");
			} 
		 
	  }
	 
	  public void vowelCheck() {
		  char ch;
		  System.out.print("Enter any Alphabet : ");
		  ch = in.next().charAt(0);
		  System.out.print("Result : ");
		  
		  switch(ch) {
		  
		  case 'a' :
		  case 'e' :
		  case 'i' :
		  case 'o' :
		  case 'u' :
			  System.out.print("It is vowel");
			  break;                  // Keyword to stop execution inside switch block must be used after every case 
		  default :                  // It is used to specify statements that execute if there is no case match
			  System.out.print("It is consonent");			  
		  }
		  
		  
		  
	  }
	
	  public void factorial() {
		  int n , f =1;
		  System.out.print("Enter any number : ");
		  n = in.nextInt();
		  
		  
		  for(int i=1; i<=n; i++) {
			  f = f*i;
		  }
		  System.out.print("It's Factorial: " + f);
	  }
	  
	  public void whileDemo() {
		  int x =1,sum =0;
		  
		  while(x<=10) {
			  sum = sum + x;
			  x++;
		  }
		  System.out.print("The sum of numbers from 1 to 10 : "+sum);
	  }
	  
	  public void positiveSum() {
		  int sum = 0,n =0;
		  
		 // This loop continues until entered number is +ve, if -ve is entered loop breaks
		  do{
			  sum += n;
			  System.out.print("Enter numbers: ");
			  n = in.nextInt();
		  }while(n>=0);
		  
			  System.out.println("Sum of Positives: " + sum);
	  }
	
	  public void arrLoop() {
		  int [] arr = {1,2,3,4,5};
		  
		  //for-each loop is used to traverse array or collection in java
		  for(int i:arr){
			  System.out.println("Arr element: " + i );
		  }
 	  }
	  
	  public static void main(String[] args){
		 
	    ControlState ob = new ControlState() ;
  	    //ob.showResult();
	    //ob.vowelCheck();
	    //ob.factorial();
	    //ob.whileDemo();
		//ob.positiveSum(); 
		ob.arrLoop(); 
		 
	  }
}


/*
   3 types of control statements: Decision Making Statements , Iteration Statements & Jump Statements
    
    - Selection/Decision making statements: if-else ,switch case
   
    - Iteration Statements: for , while , do ... while
    
    - Jump Statements: break , continue ,Return
      - continue continues current flow nd skips the code at specified condition
        Eg: if we set to print number from 1 to 10 nd we add conditon that if i == 5 continue then it slips 5 nd prints rest all nums.
*/ 