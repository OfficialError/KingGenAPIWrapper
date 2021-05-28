/**
 * This is a java file created by Error.
 * @author Error.
 * Created on 28.05.2021 (19:44:26)
 */
package vip.gamerhost.kinggenwrapper;

public class Account {
	
	private String email, password;
	
	public Account(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	/*
	 * @return email
	*/
	public String getEmail() {
		return email;
	}
	
	/*
	 * @return password
	*/
	public String getPassword() {
		return password;
	}
	
}