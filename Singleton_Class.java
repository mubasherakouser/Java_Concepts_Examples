//Singleton_Class
package com.jspiders.singleton;

public class Connection {
	private static Connection Con=null;
	public static Connection getConnection()
	{
		if(Con==null) {
			Con=new Connection();
		}
		return Con;
	}
private Connection() {

	}
}
public class Mainclass {
	public static void main(String[] args) {
		Connection c1=Connection.getConnection();
		Connection c2=Connection.getConnection();
		Connection c3=Connection.getConnection();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
