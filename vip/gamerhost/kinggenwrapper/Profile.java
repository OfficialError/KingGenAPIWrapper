/**
 * This is a java file created by Error.
 * @author Error.
 * Created on 28.05.2021 (21:24:58)
 */
package vip.gamerhost.kinggenwrapper;

public class Profile {
	
	private String username;
	private int generated, generatedToday;
	
	public Profile(String username, int generated, int generatedToday) {
		this.username = username;
		this.generated = generated;
		this.generatedToday = generatedToday;
	}
	
	/*
	 * generated
	*/
	public int getGenerated() {
		return generated;
	}
	
	/*
	 * generatedToday
	*/
	public int getGeneratedToday() {
		return generatedToday;
	}
	
	/*
	 * username
	*/
	public String getUsername() {
		return username;
	}
	
	
}