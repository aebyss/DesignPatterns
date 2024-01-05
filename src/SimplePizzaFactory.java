public class SimplePizzaFactory {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("salami")) {
            pizza = new SalamiPizza();
        }
        return pizza;
    }
}
