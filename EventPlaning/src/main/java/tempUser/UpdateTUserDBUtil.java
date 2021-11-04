package tempUser;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTUserDBUtil {
	
	private static boolean isSuccess;
	
	public static boolean updateTUser(String type,String date,String Hid,String Mid,String Did,String Bid,String part) {
		
		int parti = Integer.parseInt(part);
		
		//create Database connection
				String url = "jdbc:mysql://localhost:3306/eventplanning";
				String user = "root";
				String pass = "root";		
		
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement stmt = con.createStatement();
					
					String sql = "update tempuser set eventDate='"+date+"',hallID='"+Hid+"',menuID='"+Mid+"',decoID='"+Did+"',bandID='"+Bid+"',participation='"+parti+"'"
					+ "where ID = 49";
					
					int rs = stmt.executeUpdate(sql);
					
					if(rs>0) {
						isSuccess = true;
					}else {
						isSuccess = false;
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		return isSuccess;
	}
	
	public static boolean DeleteTUser() {
		
		//create Database connection
				String url = "jdbc:mysql://localhost:3306/eventplanning";
				String user = "root";
				String pass = "root";		
		
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement stmt = con.createStatement();
					
					String sql = "delete from tempuser where ID = 49";
					
					int rs = stmt.executeUpdate(sql);
					
					if(rs>0) {
						isSuccess = true;
					}else {
						isSuccess = false;
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		return isSuccess;
	}
}
