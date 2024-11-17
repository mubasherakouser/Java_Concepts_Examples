//Abstract_class--> Partial Abstraction
abstract class Hotstar {
    void login(){
      //code
    } 
    abstract void watch();
}
class HotstarFree extends Hotstar {
    @Override
    void watch() {
        System.out.println("Ad + Trailer");
    }
}
class HotstarVIP extends Hotstar {
    @Override
    void watch() {
        System.out.println("Ad + Regional");
    }
}
class HotstarPremium extends Hotstar {
    @Override
    void watch() {
        System.out.println("All Content");
    }
}
public class Mainclass {
    public static void main(String[] args) {
        Hotstar hs;
        hs = new HotstarFree();
        hs.watch();
        hs = new HotstarVIP();
        hs.watch();
        hs = new HotstarPremium();
        hs.watch();
    }
}
