//constructor overloading
package com.jspiders.constructoroverloading;
class Demo{
	Demo(int a){
		System.out.println("int argument constructor");
	}
	Demo(double  d){
		System.out.println("double argument constructor");
	}
	Demo(String s){
		System.out.println("string argument constructor");
	}
}
public class Mainclass{
	public static void main(String[] args) {
		Demo d1=new Demo(10);
		Demo d2=new Demo(4.54);
		Demo d3=new Demo("Mubashera");
	}
}
