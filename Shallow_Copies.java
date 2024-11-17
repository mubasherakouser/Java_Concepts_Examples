//Shallow copies 
package com.jspiders.Introduction;
class Laptop{
	String wallpaper="Deepika";
}

public class Mainclass {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		Laptop l2=l1;
		System.out.println(l1.wallpaper);
		System.out.println(l1.wallpaper);
		l1.wallpaper="Alia";
		System.out.println(l1.wallpaper);
		System.out.println(l1.wallpaper);
		
	}

}
