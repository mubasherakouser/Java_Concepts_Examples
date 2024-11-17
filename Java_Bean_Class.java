//Java Bean Class
package com.jspiders.encapsulation;
public class Credentials {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Credentials c=new Credentials();
		c.setUsername("admin");
		c.setPassword("admin123");
		System.out.println(c.getUsername());
		System.out.println(c.getPassword());
	}
}
