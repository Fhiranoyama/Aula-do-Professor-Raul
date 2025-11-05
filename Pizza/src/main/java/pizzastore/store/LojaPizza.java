package pizzastore.store;

import pizzastore.pizza.Pizza;

public abstract class LojaPizza {
    public Pizza orderPizza(String tipo) {
        Pizza pizza = criarPizza(tipo);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza criarPizza(String tipo);
}


