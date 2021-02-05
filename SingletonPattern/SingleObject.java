package SingletonPattern;

class SingleObject0 {
    //这是饿汉式
    private SingleObject0() {}

    private String name;
    private static SingleObject0 instance = new SingleObject0();

    public static SingleObject0 getInstance() {
        return instance;
    }

    public void setName(String name1) {
        name = name1;
    }

    public String getName() {
        return name;
    }

}

class SingleObject1{
    //这个是懒汉式
    private SingleObject1() {}
    private String name;
    private static SingleObject1 instance;
    public static synchronized  SingleObject1 getInstance() {
        if(instance == null)
        {
            instance = new SingleObject1();
        }
        return instance;
    }
    public void setName(String name1) {
        name = name1;
    }
    public String getName() {
        return name;
    }
}

class DoubleCheck{
    //双重校验锁
    private DoubleCheck(){};
    private static DoubleCheck instance;
    public static DoubleCheck getInstance(){
        if(instance == null){
            synchronized (instance){
                if (instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}

enum Singleton{
    INSTANCE;
    public void anyMethod(){

    }
}