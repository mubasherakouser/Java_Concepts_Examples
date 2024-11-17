//Singleton_Class
//Lazy Initialization
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

//Enthusiastic Initialization

class Resource {
    private static Resource res = new Resource(); // Enthusiastic initialization
    public static Resource getResource() {
	    if(res==null){
               res=new Resource();
	    }		    
        return res;
    }
	// Private constructor to prevent external instantiation
    private Resource() {
	    
    }
}
public class Mainclass {
    public static void main(String[] args) {
        Resource r1 = Resource.getResource();
        Resource r2 = Resource.getResource();
        Resource r3 = Resource.getResource();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
