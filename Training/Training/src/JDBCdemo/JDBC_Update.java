package JDBCdemo;

import java.sql.*;
import java.util.Scanner;

public class JDBC_Update {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String value; int empid; String ename;
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","123456"); 
			
			// Prepare Statement
			Statement st = con.createStatement();
			
			// Creating object of Scanner class inside main() method
			 Scanner in = new Scanner(System.in);
			
			// Taking integer input
		     System.out.println("Enter Emp ID: ");
			 value = in.nextLine();
			 empid = Integer.parseInt(value); 
				
			 System.out.println("Enter new Emp Name: ");
			 ename = value;
			 value = in.next();
			
				
				
			 int count = st.executeUpdate("update emp set ename="+ename+" where empid="+empid);
			 if(count>0)
			 	System.out.println("No.of Records updated: "+count+" record updated");
			 else
			 	System.out.println("No such record found");	
		 }
		 catch(Exception e){
			System.out.println(e);
		 }
		
    }

}
