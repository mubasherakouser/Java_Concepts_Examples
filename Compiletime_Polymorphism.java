//Compile time polymorphism
class Flipkart{
void payment(){
System.out.println("cod");
}
void payment(String upi){
System.out.println("Cashback");
}
void payment(long card){
System.out.println("CARD"NO COST EMI");
}
void payment(String un,String pwd){
System.out.println("Net bangking,discount");
}
}
public class Mainclass1{
public static void main(String[] args){
Flipkart f=new Flipkart();
f.payment();
f.payment("pavan@icici");
f.payment(45456734001234L");
f.payment("pavan","pavan123");
}
}
