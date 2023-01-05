package FileHandling;

import java.io.*;
import java.util.Scanner;

public class DemoFileIO {

  // Method o write a content into file	
  public void writeToFile(File fileToWrite) {
	 PrintWriter empInfoWriter = null;    //PrintWriter used to print an array of characters
	 try {
	     empInfoWriter = new PrintWriter(fileToWrite);
	 	 empInfoWriter.println("Arjun");
	 	 empInfoWriter.println("7192");
	 }catch (FileNotFoundException e) {
	 	 System.out.println("File Not Found "+fileToWrite.getName());
	 	 throw new RuntimeException(e);
	 }finally {
	 	 empInfoWriter.close();
	 }
   }
	
  // Method to read content from file
   public void readFile(File fileToRead)throws FileNotFoundException {
	  
	   Scanner in = new Scanner(fileToRead);
	 // hasNext method returns true if and only if this scanner has another token
	   while(in.hasNext()) { 
	     System.out.println("Read line from input file: "+in.nextLine());
	   }
   }
   
   public static void main(String[] args) throws FileNotFoundException {
		
	    String path = "C:\\Users\\Asus\\eclipse-workspace\\Training\\src\\FileHandling\\sample.txt";
		File empInfo = new File(path);
		DemoFileIO f = new DemoFileIO();
		f.writeToFile(empInfo);
		
		File vehicle = new File("C:\\Users\\Asus\\eclipse-workspace\\Training\\src\\FileHandling\\vehicle.txt");
		f.readFile(vehicle);
   }
	
	

}
