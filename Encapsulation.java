//Encapsulation save public class in one file and main class in another file
package com.jspiders.encapsulation;
public class Person {
		private int age;
		private long aadhar;
		public int getAge() {
			//Authentication
			return age;
		}
		public void setAge(int age) {
			//Authentication
			this.age=age;
		}
		public long getAadhar() {
			//Authentication
			return aadhar;
		}
		public void setAadhar(long aadhar) {
			//Authentication
			this.aadhar=aadhar;
		}
	}
public class Mainclass {
	public static void main(String[] args) {
		Person p=new Person();
		p.setAge(18);
		p.setAadhar(47471123987L);
		System.out.println("Age" +p.getAge());
		System.out.println("Aadhar" +p.getAadhar());
	}
}
