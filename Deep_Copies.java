//Deep copies example
package com.jspiders.Introduction;
class Player{
	String name="Dhoni";
}
public class mainclass2 {
public static void main(String[] args) {
Player p1=new Player();
Player p2=new Player();
System.out.println(p1.name);
System.out.println(p2.name);
p1.name="kohli";
System.out.println(p1.name);
System.out.println(p2.name);

}
}
