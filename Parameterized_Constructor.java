//package com.jspiders.constructors;
class Player{
	String name;
	int jerseynumber;
	Player(String s,int j)
	{
		name=s;
		jerseynumber=j;
	}

}
public class Mainclass {
	public static void main(String[] args) {
		Player p1=new Player("dhoni",7);
		System.out.println(p1.name);
		System.out.println(p1.jerseynumber);
		Player p2=new Player("kohli",18);
		System.out.println(p2.name);
		System.out.println(p2.jerseynumber);
}
}
