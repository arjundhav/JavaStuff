package JDBCdemo;

import java.sql.*;
import java.util.Scanner;

public class JDBC_delete {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","123456"); 
			Statement st = con.createStatement();
			
			// Creating object of Scanner class inside main() method
			Scanner in = new Scanner(System.in);
			
			while(true) {
				
				// Taking integer input
				System.out.println("Enter Deletion Emd ID: ");
				int empid = Integer.parseInt(in.next());
				
				int count = st.executeUpdate("delete from emp where empid ="+empid);
				
				if(count>0)
					System.out.println("No.of Records Deleted: "+count+" record deleted");
				else
					System.out.println("No such record exist");
				
				System.out.println("Wanna delete more records[Yes/No]");
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
