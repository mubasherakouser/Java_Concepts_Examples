//Super Keyword
class Demo {
    int val = 0;
    void run() {
        System.out.println("Executing run()");
    }
}
class Sample extends Demo {
    int val = 80;
    void play() {
        System.out.println(this.val);
        System.out.println(super.val);
        super.run();
    }
}
public class MainClass {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.play();
    }
}
