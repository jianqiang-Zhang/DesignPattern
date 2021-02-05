package Prototype;

public class User {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setName("Circle");
        try {
            Shape shape1 = (Shape) shape.clone1();
            shape1.setName("Rectangle");
            shape.printAddress();
            shape1.printAddress();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
