package pizzastore.pizza;

import pizzastore.factory.FabricaIngredientesPizza;

public class PizzaQueijo extends Pizza {
    private final FabricaIngredientesPizza fabricaIngredientes;

    public PizzaQueijo(FabricaIngredientesPizza fabricaIngredientes) {
        this.fabricaIngredientes = fabricaIngredientes;
        this.name = "Pizza de Queijo";
    }

    @Override
    public void prepare() {
        dough = fabricaIngredientes.criarMassa();
        sauce = fabricaIngredientes.criarMolho();
        cheese = fabricaIngredientes.criarQueijo();
        veggies = fabricaIngredientes.criarVegetais();
        System.out.println("Preparando " + name);
    }
}


