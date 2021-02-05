package BridgePattern;

public abstract class Computer {
    Brand brand;
    public Computer(Brand brand1){
        this.brand = brand1;
    }

    abstract public void sale();

}

class Laptop extends Computer{

    public Laptop(Brand brand1) {
        super(brand1);
    }

    @Override
    public void sale() {
        System.out.println("出售"+brand.printBrand()+"的笔记本电脑");
    }
}

class Desktop extends Computer{

    public Desktop(Brand brand1) {
        super(brand1);
    }

    @Override
    public void sale() {
        System.out.println("出售"+brand.printBrand()+"的台式电脑");
    }
}