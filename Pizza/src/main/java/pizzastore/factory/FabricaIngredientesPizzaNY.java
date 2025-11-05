package pizzastore.factory;

import pizzastore.ingredients.*;
import pizzastore.ingredients.impl.*;

public class FabricaIngredientesPizzaNY implements FabricaIngredientesPizza {
    @Override
    public Massa criarMassa() { return new MassaFina(); }

    @Override
    public Molho criarMolho() { return new MolhoMarinara(); }

    @Override
    public Queijo criarQueijo() { return new QueijoReggiano(); }

    @Override
    public Vegetais[] criarVegetais() {
        return new Vegetais[]{ new Alho(), new Cebola(), new Cogumelo(), new PimentaoVermelho() };
    }

    @Override
    public Pepperoni criarPepperoni() { return new PepperoniFatiado(); }

    @Override
    public Mariscos criarMariscos() { return new MariscosFrescos(); }
}


