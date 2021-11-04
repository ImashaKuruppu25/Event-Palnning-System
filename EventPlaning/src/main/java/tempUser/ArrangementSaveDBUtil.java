package tempUser;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.Statement;

public class ArrangementSaveDBUtil {
	
	public boolean SavelDetails(String type, String hall, String menu, String deco, String band, int total,String date,String part ){
		
		String url = "jdbc:mysql://localhost:3306/eventplanning";
		String user = "root";
		String pass = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into tempuser values ('"+0+"','"+type+"','"+date+"','"+hall+"','"+menu+"','"+deco+"','"+band+"',"+part+","+total+")";
			 stmt.executeUpdate(sql);
			
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return true;
	}
	
	
}

