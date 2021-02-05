package BridgePattern;

public class User {
    public static void main(String[] args) {
        Computer computer1 = new Desktop(new Huawei());
        computer1.sale();
        Computer computer2 = new Laptop(new Huawei());
        computer2.sale();
        Computer computer3 = new Desktop(new OMEN());
        computer3.sale();
    }
}
