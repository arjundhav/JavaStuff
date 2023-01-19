package tut;

public class StringDemo {
 
	public static void main(String[] args) {
				
		String s1 ="Happy";
		String s2 ="Happy";
		
		System.out.println(s1);
		System.out.println(s1.concat(" Birthday"));
		System.out.println("length of s1: "+s1.length());
		System.out.println("Comparing s1&s2: "+s1.compareTo(s2));
		System.out.println("Is equal: "+s1.equals(s2));
		System.out.println("Uppercase s1: "+s1.toUpperCase());
		System.out.println("Substring of s1: "+s1.substring(1,4));
		System.out.println("char at index: "+s2.charAt(1));
		System.out.println("Endswith: "+s1.endsWith("y"));
	 //replacing character from exsisting string	
		System.out.println("Replace char in s2: "+s2.replace('H', 'L'));
    
	//contains()
		boolean s3 = s2.contains("H");
		System.out.println("Contains: "+s3);
		
	 // convert diff data types to string
		int a = 40;
		String s =String.valueOf(a);
		System.out.println("Value: "+s+"\n\t");
		
		
	 // StringBuffer
		
		StringBuffer b = new StringBuffer("Hello Arjun ");
		System.out.println("Buffer string: "+b);
		
		StringBuffer b1= b.append("Wassup ");
		System.out.println("Appended String: "+b1);
		
		StringBuffer b2= b1.insert(18," Buddy !!!");
		System.out.println("Inserted string is:" + b2);
		System.out.println("Reversed string: "+b.reverse());
		
		StringBuffer b4 =b1.delete(0,5);
		System.out.println("Reduced String: "+b4+"\n\n");
		
	  // StringBuilder
		StringBuilder c = new StringBuilder("Hello ");
		c.append("KunalJ !!!");
		System.out.println("Builder string: "+c);
		
		System.out.println(c.delete(11, 12));
		System.out.println(c.reverse());
		
		
	}

}

/* 
   String is data type with group of characters.
 
    - They are immutable i.e cant be changed.
    - Follows stack principal FIFO 
       
      Eg:   String name = "value";
   
   String Handling: length,compareTo,equals,toUpperCase,LowerCase
                    substring,charAt,endsWith,replace,contains,valueOf
                    
   String Buffer: They are used to create mutable string(can be changed)
                      It is syncrhronised i.e one process at a time.
                      Its capacity is 16.
                      
   String Builder: They are used to create mutable string & are non-synchronized.
                   Thus it is faster than StringBuffer                    
                    
*/