//Has-A-Relationship
package com.jspiders.has_a;
class Car{
	Engine eng=new Engine();
	Driver dr=new Driver();
}
class Engine{
	void power() {
		System.out.println("Executing power method........");
		
	}
}
class Driver{
	void driving() {
		System.out.println("Executing driving method........");
		
	}
}
public class Mainclass2 {
public static void main(String[] args) {
	Car c=new Car();
	c.eng.power();
	c.dr.driving();
}
}
