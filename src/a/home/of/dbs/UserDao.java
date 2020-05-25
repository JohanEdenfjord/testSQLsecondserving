package a.home.of.dbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

	public void registerUser(Users user) {
		String INSERT_USERS_SQL = "INSERT INTO names (first_name , last_name, user_name) VALUES (?,?,?);";
		String INSERT_PASSWORD_SQL = "INSERT INTO secretinfo (the_password) VALUES (?);";

				
		Connection connection = ConnectionManager.open();
		
		
		PreparedStatement userInfo;
		try {
			userInfo = connection.prepareStatement(INSERT_USERS_SQL);
			userInfo.setString(1, user.getFirstName());
			userInfo.setString(2, user.getLastName());
			userInfo.setString(3, user.getUserName());

			System.out.println(userInfo);		

			PreparedStatement passStatement = connection.prepareStatement(INSERT_PASSWORD_SQL);
			passStatement.setString(1, user.getPassword());

			System.out.println(passStatement);

			// lets doit		
		
			userInfo.executeUpdate(); //adds the number of lines affected by this statement!	
			passStatement.executeUpdate();	
			
			userInfo.close();
			passStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 		
		
	}

	
}
