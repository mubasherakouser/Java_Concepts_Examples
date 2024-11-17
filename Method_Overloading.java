//Method Overloading
package com.jspiders.methodoverloading;
class Swiggy{
	void payment() {
		System.out.println("COD");
		}
	void payment(String upi) {
		System.out.println("UPI");
		}
	void payment(long card) {
		System.out.println("CARD");
		}
	void payment(String un,String password) {
		System.out.println("NETBANKING");
		}
}
public class Mainclass {
	public static void main(String[] args) {
		Swiggy a=new Swiggy();
		a.payment();
		a.payment(4536782654L);
		a.payment("Mubashera@icici");
		a.payment("Kouser","Kouser@123");
	}
}
