package pizzastore;

import pizzastore.store.LojaPizza;
import pizzastore.store.LojaPizzaChicago;
import pizzastore.store.LojaPizzaNY;

public class Main {
    public static void main(String[] args) {
        LojaPizza lojaNY = new LojaPizzaNY();
        LojaPizza lojaChicago = new LojaPizzaChicago();

        lojaNY.orderPizza("queijo");
        lojaNY.orderPizza("mariscos");

        lojaChicago.orderPizza("queijo");
        lojaChicago.orderPizza("mariscos");
    }
}


