import java.sql.*;

public class SelectDemo {
	
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
			
			String query="Select name,designation,dept,salary,doj from employee";
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				String name=rs.getString("name");
				String dept=rs.getString("dept");
				String designation=rs.getString("designation");
				float salary=rs.getFloat("salary");
				String doj=rs.getString("doj");
				
				System.out.println(name+ " - "+dept+" - " +" - "+designation+" - "+salary+" - "+doj);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
