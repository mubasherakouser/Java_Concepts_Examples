package com.jspiders.constructors;
class Alpha{
	int x;
	Alpha(){
	System.out.println("Alpha() constructor");
	x=25;
}
}
public class Mainclass{
	public static void main(String[] args) {
		Alpha ref=new Alpha();
		System.out.println(ref.x);
	}
}
