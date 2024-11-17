//passing and returnig objects
package com.jspiders.passandreturnobjects;
class Biryani {
	String name;
	int qty;
	double price;
	Biryani(String n,int q,double p){
		name=n;
		qty=q;
		price=p;
	}
}
public class Hotel {
	static void display(Biryani b) {
		System.out.println("Name :" +b.name);
		System.out.println("Qty :" +b.qty);
		System.out.println("Price :" +b.price);
	}
static Biryani create() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Quantity :");
		int q=sc.nextInt();
		System.out.println("Price :");
		double p=sc.nextDouble();
		System.out.println("Name :");
		String n=sc.next();
		Biryani b=new Biryani(n,q,p);
		return b;
	}
}
public class Mainclass {
	public static void main(String[] args) {
		Biryani b1=Hotel.create();
		Biryani b2=Hotel.create();
		Biryani b3=Hotel.create();
		Hotel.display(b1);
		Hotel.display(b2);
		Hotel.display(b3);
		}
}
