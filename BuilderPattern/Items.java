package BuilderPattern;

public interface Items {
    public Pack setPack();
    public double setPrice();
    public String setName();
}

abstract class Burger implements Items{
    public Pack setPack(){
        return new Wrapper();
    }
}
abstract class Drink implements Items{
    @Override
    public Pack setPack() {
        return new Bolt();
    }
}

class BeefBurger extends Burger{
    @Override
    public String setName() {
        return "牛肉堡";
    }

    @Override
    public double setPrice() {
        return 29.95;
    }
}
class VegBurger extends Burger{
    @Override
    public String setName() {
        return "素堡";
    }

    @Override
    public double setPrice() {
        return 18.95;
    }
}
class ChickenBurger extends Burger{
    @Override
    public String setName() {
        return "鸡肉堡";
    }

    @Override
    public double setPrice() {
        return 26.50;
    }
}

class OrangeJuice extends Drink{
    @Override
    public String setName() {
        return "橙汁";
    }

    @Override
    public double setPrice() {
        return 8.30;
    }
}
class Coffee extends Drink{
    @Override
    public String setName() {
        return "咖啡";
    }

    @Override
    public double setPrice() {
        return 20.50;
    }
}
class Milk extends Drink{
    @Override
    public String setName() {
        return "牛奶";
    }

    @Override
    public double setPrice() {
        return 15.5;
    }
}