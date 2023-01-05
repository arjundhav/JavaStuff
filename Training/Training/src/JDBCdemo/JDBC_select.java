package JDBCdemo;

import java.sql.*;

public class JDBC_select {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
		// Open a connection by creating a Connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","123456"); 
			
		// DB name Arjun
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            
            while(rs.next()) {
    			// Retrieve by column name
    				System.out.println("Emp ID: "+rs.getInt("empid")); //gets value stored in the column C in the current row of rs 
    				System.out.println("EName: "+rs.getString("ename"));
    				System.out.println("Emp Salary: "+rs.getDouble("esal"));
    				System.out.print("\n");
    			} 

	    } catch(Exception e){
	    	System.out.println(e);
	    }
	  }
			
}
