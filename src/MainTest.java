public class MainTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("salami");
        String x = pizza.toString();
        System.out.println(x);
    }
}
