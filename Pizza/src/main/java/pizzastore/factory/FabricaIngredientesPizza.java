package pizzastore.factory;

import pizzastore.ingredients.*;

public interface FabricaIngredientesPizza {
    Massa criarMassa();
    Molho criarMolho();
    Queijo criarQueijo();
    Vegetais[] criarVegetais();
    Pepperoni criarPepperoni();
    Mariscos criarMariscos();
}


