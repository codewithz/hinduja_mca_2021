
import java.sql.*;

public class DeleteDemo {
	
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
			
			String query="Delete from employee where id=5";
			
			int rowDeleted=stmt.executeUpdate(query);
			
			System.out.println("Rows Deleted:"+rowDeleted);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}