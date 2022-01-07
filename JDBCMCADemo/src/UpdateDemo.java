
import java.sql.*;

public class UpdateDemo {
	
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
			
			String query="Update employee set salary=35000.35 where id=1";
			
			int rowUpdated=stmt.executeUpdate(query);
			
			System.out.println("Rows Updated:"+rowUpdated);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}