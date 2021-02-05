package BuilderPattern;

public class MealBuilder {

    public Meal combo1(){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Coffee());
        return meal;
    }

    public Meal combo2(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coffee());
        return meal;
    }

    public Meal combo3(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Milk());
        return meal;
    }

    public Meal combo4(){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new OrangeJuice());
        return meal;
    }
}
