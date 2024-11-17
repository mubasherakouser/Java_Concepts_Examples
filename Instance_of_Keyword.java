//Instance of keyword
package com.jspiders.instanceofkeyword;
class Fruit{
	
}
class Apple extends Fruit{
	
}
class Mango extends Fruit{
	
}
class Banana extends Fruit{
	
}
class BigBasket{
	static void addToBasket(Fruit f) {
		if(f instanceof Apple) {
			System.out.println("Apples are added");
		}
		if(f instanceof Mango) {
			System.out.println("Mangoes are added");
		}
		if(f instanceof Banana) {
			System.out.println("Bananas are added");
		}
	}
}
public class Mainclass {
	public static void main(String[] args) {
	Apple a=new Apple();
	BigBasket.addToBasket(a);
	Mango m=new Mango();
	BigBasket.addToBasket(m);
	Banana b=new Banana();
	BigBasket.addToBasket(b);
}
}
