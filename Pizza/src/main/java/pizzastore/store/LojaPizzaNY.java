package pizzastore.store;

import pizzastore.factory.FabricaIngredientesPizza;
import pizzastore.factory.FabricaIngredientesPizzaNY;
import pizzastore.pizza.Pizza;
import pizzastore.pizza.PizzaMariscos;
import pizzastore.pizza.PizzaQueijo;

public class LojaPizzaNY extends LojaPizza {
    @Override
    protected Pizza criarPizza(String tipo) {
        FabricaIngredientesPizza fabrica = new FabricaIngredientesPizzaNY();
        return switch (tipo.toLowerCase()) {
            case "queijo", "cheese" -> new PizzaQueijo(fabrica);
            case "mariscos", "clam" -> new PizzaMariscos(fabrica);
            default -> throw new IllegalArgumentException("Tipo de pizza desconhecido: " + tipo);
        };
    }
}


