package pizzastore.store;

import pizzastore.factory.FabricaIngredientesPizza;
import pizzastore.factory.FabricaIngredientesPizzaChicago;
import pizzastore.pizza.Pizza;
import pizzastore.pizza.PizzaMariscos;
import pizzastore.pizza.PizzaQueijo;

public class LojaPizzaChicago extends LojaPizza {
    @Override
    protected Pizza criarPizza(String tipo) {
        FabricaIngredientesPizza fabrica = new FabricaIngredientesPizzaChicago();
        Pizza pizza = switch (tipo.toLowerCase()) {
            case "queijo", "cheese" -> new PizzaQueijo(fabrica);
            case "mariscos", "clam" -> new PizzaMariscos(fabrica);
            default -> throw new IllegalArgumentException("Tipo de pizza desconhecido: " + tipo);
        };
        pizza.setName(pizza.getName() + " (Estilo Chicago)");
        return pizza;
    }
}


