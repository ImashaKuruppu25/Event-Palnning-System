package tempUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DecoSelectorDBUtil {

public Deco getDecoDetails(String did){
		
		//create Database connection
		String url = "jdbc:mysql://localhost:3306/eventplanning";
		String user = "root";
		String pass = "root";
	
		Deco d = new Deco();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "select * from deco where decoID ='"+did+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				String DID = rs.getString(1);
				String name = rs.getString(2);
				String desc = rs.getString(3);
				int price = rs.getInt(4);
				
				d =  new Deco(DID, name, desc, price);
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return d;
	}
}
