//This Statement
package com.jspiders.constructorchaining;
class Food {
    Food(int a) {
        System.out.println("Biryani");
    }
    Food(double d) {
        this(10);
        System.out.println("Shawarma");
    }
    Food(String s) {
        this(4.5); // Calling another constructor of same class
        System.out.println("Panipuri");
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        Food f = new Food("Java");
    }
}

//Super Statement
package com.jspiders.constructorchaining;
class Alpha {
	Alpha(){
		System.out.println("Alpha() constructor");
	}
	Alpha(int a){
		this();
		System.out.println("Alpha(int) constructor");
	}
}
class Beta extends Alpha{
	Beta(){
		super(10);
		System.out.println("Beta() constructor");
	}
}
public class Mainclass {
public static void main(String[] args) {
Beta b=new Beta();
}
}
