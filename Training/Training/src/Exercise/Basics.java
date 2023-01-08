package Exercise;

public class Basics {
    public int num;
    public int num1;
    
    public int sumOfDigits(){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

  //Method to find Palindrome of NumberS
    public void palindrome(){
        int temp = num1;   //Hold the number in temporary variable
        int rev = 0;
        while(temp > 0){
            rev = (rev * 10) + (temp % 10);   // 
            temp /= 10;
        }
        if(rev == num1)          
          System.out.println("Is Palindrome");
        else
            System.out.println("Is not Palindrome");
    }

    public static void main(String[] args){
     
        Basics obj = new Basics();
        obj.num = 647;
        obj.num1 = 121;
    
        System.out.println("Sum of digits of is: " + obj.sumOfDigits());
        
        obj.palindrome();           
    } 
}

/*

Logic SumofDigits:  

First iteration
   674 % 10 = 4
   Sum = 0 + 4 = 4
   674 / 10 = 67

Second iteration 
    67 % 10 = 7
    Sum = 4 + 7 = 11
    67 / 10 = 6

Third iteration
    6 % 10 = 6
    Sum = 11 + 6 = 17
    6 / 10 = 0  

    Now the number (N) has become 0. So, we will not process it further. Hence, we get 17 as the sum of digits of the number 674

 */