package a.home.of.dbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChangePass {
	
	public void changePassword(Users user) {
	
	String GET_USERID_SQL = "SELECT names.userID FROM names WHERE names.user_name = ?";
	
	String UPDATE_PASS_SQL = "UPDATE secretinfo SET the_password = ? WHERE secretinfo.id = ?";
	
	Connection connection = ConnectionManager.open();
	
	try {
		PreparedStatement getID = connection.prepareStatement(GET_USERID_SQL);
		getID.setString(1, user.getUserName());
		ResultSet id = getID.executeQuery();
		
		
		
		
		PreparedStatement update = connection.prepareStatement(UPDATE_PASS_SQL);
		
		update.setString(1, user.getPassword());
		while(id.next()) {
			update.setInt(2, id.getInt(1)); 
		}
		
		int pChange = update.executeUpdate();
		System.out.println("Succesfull change " + pChange + " rows");
		
		getID.close();
		update.close();//closing connections.
		
	}catch(SQLException e) {
		System.out.println(e);
	}
	
	}

}
