
import java.sql.*;

public class InsertDemo {
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/hinduja_mca_2021";
			String user="root";
			String password="admin";
			
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("Connection Acquired");
			
			Statement stmt=con.createStatement();
			
			String query="Insert into employee(name,dept,designation,salary,doj) values ('Tom','IT','Dev',30000.30,'2020-09-01')";
			
			int rowInserted=stmt.executeUpdate(query);
			
			System.out.println("Rows Inserted:"+rowInserted);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}