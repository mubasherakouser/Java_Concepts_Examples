//Runtime Polymorphism
class Facebook{
void display(){
  //code
}
}
class Fbmobile extends Facebook{
@Override
void display(){
System.out.println("display in mobile");
}
}
class Fbwebsite extends Facebook{
@Override
void display(){
System.out.println("display in browser");
}
}
public class Mainclass{
public static void main(String[] args){
fb1=new Facebookwebsite();
fb1.display();
fb1=new FacebookMobile();
fb1.display();
}
}
