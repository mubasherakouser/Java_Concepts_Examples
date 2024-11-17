//class and object java program
package com.jspiders.Introduction;
class Student{
	String name;
	int yop;
	void write() {
		System.out.println("Executing write()");
	}
	void study() {
		System.out.println("Executing study()");
	}
}

public class mainclass1 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="sneha";
		s1.yop=2024;
		s1.write();
		s1.study();
	}

}
