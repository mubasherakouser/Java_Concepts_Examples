//Method_Overriding
class WhatsApp1 {
    void deliveryReport() {
        System.out.println("Sent");
    }
}
class WhatsApp2 extends WhatsApp {
    @Override
    void deliveryReport() {
        System.out.println("Sent - Delivered");
    }
}
class WhatsApp3 extends WhatsApp2 {
    @Override
    void deliveryReport() {
        System.out.println("Sent - Delivered - Seen");
    }
}
public class MainClass {
    public static void main(String[] args) {
        WhatsApp1 w1 = new WhatsApp1();
        w1.deliveryReport();

        WhatsApp w2 = new WhatsApp2();
        w2.deliveryReport();

        WhatsApp w3 = new WhatsApp3();
        w3.deliveryReport();
    }
}
