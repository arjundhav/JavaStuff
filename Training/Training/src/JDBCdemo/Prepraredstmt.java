package JDBCdemo;

import java.sql.*;
import java.util.Scanner;

//Used to insert table in DB
public class Prepraredstmt {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try {
			// Register Driver Class
			//Class.forName("com.mysql.jdbc.Driver");
			
			// Connection to your database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","123456"); 
			
			// Prepare Statement
			PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
			
			// Creating object of Scanner class inside main() method
			Scanner in = new Scanner(System.in);
			
			while(true) {
				
				// Taking integer input
				System.out.println("Enter Emp ID: ");
				int empid = in.nextInt(); 
				
				System.out.println("Enter a Emp Name: ");
				String ename = in.next();
				
				System.out.println("Enter Emp salary:");
				double esal = in.nextDouble();
				
				//to know the position of columns to java we use pst
				pst.setInt(1, empid);
				pst.setString(2, ename);
				pst.setDouble(3, esal);
				
				int count = pst.executeUpdate();
				if(count>0)
					System.out.println("No.of Records inserted: "+count+" record inserted");
				else
					System.out.println("No record inserted");
				
				System.out.println("Wanna add more records[Yes/No]");
				String ch = in.next();
				if(ch.equalsIgnoreCase("no"))
			       break;
			}	
		}
		catch(Exception e){
			System.out.println(e);
		}
		
    }

}
