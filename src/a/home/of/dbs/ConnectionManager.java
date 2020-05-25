package a.home.of.dbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	public static Connection open() {		
		Connection connect = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3308/for_school?useLegacyDatetimeCode=false&serverTimezone=Europe/Stockholm",
					"root", "");
		if(connect != null) {
			System.out.println("it works! Connectionmanagern!");
		}else {
			System.out.println("noooooo CM didnt work, asswipe");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return connect;
	}
	

}
