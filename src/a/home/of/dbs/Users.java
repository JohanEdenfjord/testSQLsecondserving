package a.home.of.dbs;

import java.io.Serializable;

public class Users implements Serializable{

	/**
	 * bean for userinformation
	 */
	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	
	public String getFirstName() {
		return firstName;
	}
		
	public String getLastName() {
		return lastName;
	}	
	
	public String getUserName() {
		return userName;
	}	
	
	public String getPassword() {
		return password;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}	
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
