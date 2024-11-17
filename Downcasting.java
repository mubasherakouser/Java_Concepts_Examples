//Downcasting
package com.jspiders.downcasting;
class Demo{
	//code
}
class Sample extends Demo{
	//code
}
public class Mainclass {
	public static void main(String[] args) {
		Demo ref=new Sample();
		Sample obj=(Sample)ref;//Downcasting
		System.out.println(ref);
		System.out.println(obj);
	}
}
