package pizzastore.pizza;

import pizzastore.factory.FabricaIngredientesPizza;

public class PizzaMariscos extends Pizza {
    private final FabricaIngredientesPizza fabricaIngredientes;

    public PizzaMariscos(FabricaIngredientesPizza fabricaIngredientes) {
        this.fabricaIngredientes = fabricaIngredientes;
        this.name = "Pizza de Mariscos";
    }

    @Override
    public void prepare() {
        dough = fabricaIngredientes.criarMassa();
        sauce = fabricaIngredientes.criarMolho();
        cheese = fabricaIngredientes.criarQueijo();
        clam = fabricaIngredientes.criarMariscos();
        System.out.println("Preparando " + name);
    }
}


