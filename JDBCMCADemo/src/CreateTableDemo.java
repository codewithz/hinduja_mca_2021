import java.sql.*;

public class CreateTableDemo {
	
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
			
			String query="Create Table demo (id int, name varchar(100));";
			
			boolean result=stmt.execute(query);
			
			if(!result) {
				System.out.println("Table Created SUccessfully");
				
			}
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
