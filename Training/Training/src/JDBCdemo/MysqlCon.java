package JDBCdemo;

import java.sql.*;

public class MysqlCon {

	public static void main(String[] args) {
	
		Statement st = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
		// Open a connection by creating a Connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun","root","123456"); 
			
		// DB name Arjun
            st = con.createStatement();
            
          //executes SQL statements for which no of rows affected
            st.executeUpdate("create table emp(empid int(4),ename varchar(12),esal int(10))"); 
            System.out.println("Table created successfully !!!");
			con.close();
           
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println(e);
         // e.printStackTrace();
		}
			
			
			
			
			
	}

}
