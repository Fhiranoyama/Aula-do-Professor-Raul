package pizzastore.factory;

import pizzastore.ingredients.*;
import pizzastore.ingredients.impl.*;

public class FabricaIngredientesPizzaChicago implements FabricaIngredientesPizza {
    @Override
    public Massa criarMassa() { return new MassaGrossa(); }

    @Override
    public Molho criarMolho() { return new MolhoTomate(); }

    @Override
    public Queijo criarQueijo() { return new QueijoMussarela(); }

    @Override
    public Vegetais[] criarVegetais() {
        return new Vegetais[]{ new Alho(), new Cebola(), new Cogumelo() };
    }

    @Override
    public Pepperoni criarPepperoni() { return new PepperoniFatiado(); }

    @Override
    public Mariscos criarMariscos() { return new MariscosCongelados(); }
}


