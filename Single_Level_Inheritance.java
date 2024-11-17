//single level inheritance
package com.jspiders.inheritance;
class Demo{
	int val=10;
	void test() {
		System.out.println("Executing test().....");
	}
}
class Sample extends Demo{
  
}
public class Mainclass {
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.val);
		s.test();
		}
}
