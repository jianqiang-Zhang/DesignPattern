package SingletonPattern;

public class User {
    public static void main(String[] args) {
        SingleObject0 object1 = SingleObject0.getInstance();
        SingleObject0 object2 = SingleObject0.getInstance();
        object1.setName("游芦");
        System.out.println("object1:"+object1.getName());
        System.out.println("object2:"+object2.getName());
    }
}
