package MaBD;

import java.sql.*;


public class ConnB {
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carnetbd",	
			"root","");
		
			if (con != null)
				System.out.println(con);
			else System.out.println(con);
		} catch (Exception e) {
			System.err.print("Exception: " + e.getMessage());
		} finally {
			try {
				if (con !=null)
					con.close();
			}catch(SQLException e) {}
			
		}	
		return con;
	}	
}
