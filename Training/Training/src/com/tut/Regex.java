package com.tut;

import java.util.regex.*;


public class Regex {

	public static void main(String[] args) {
		String pattern = "[a-zA]+";
		String check = "Happy Bday! Welcome Arjun";
		
		Pattern p = Pattern.compile(pattern);  //define a pattern for the regex engine.
	    Matcher c = p.matcher(check);  
		
		while(c.find()) {
			System.out.println(check.substring(c.start(),c.end()));
		}
                         
	}

}

/*
  abc - sequence to be followed
 [abc] - Any 1 letter a,b or c should match
 [^abc] - Any letter except these 3
 [a-zA-z0-9] - Any 1 letter or digit should be in sequence
  ^ - char present at beginning
  $ - char at end of line
 \G - char is present at end of previous match
 
 
*/