//This Keyword
class Manager {
    int mgrid;

    void meeting() {
        System.out.println("Manager is in meeting");
    }

    void status() {
        System.out.println("Manager is doing status report");
    }

    void manage() {
        System.out.println("Manager ID: " + mgrid);
        this.meeting();
        this.status();
    }

    Manager(int mgrid) {
        this.mgrid = mgrid;
    }
}

public class Program {
    public static void main(String[] args) {
        Manager mgr = new Manager(420);
        mgr.manage();
    }
}
