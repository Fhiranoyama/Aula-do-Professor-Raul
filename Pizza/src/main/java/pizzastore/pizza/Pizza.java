package pizzastore.pizza;

import pizzastore.ingredients.*;

public abstract class Pizza {
    protected String name;
    protected Massa dough;
    protected Molho sauce;
    protected Vegetais[] veggies;
    protected Queijo cheese;
    protected Pepperoni pepperoni;
    protected Mariscos clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Assar por 25 minutos a 180°C");
    }

    public void cut() {
        System.out.println("Cortando a pizza em fatias diagonais");
    }

    public void box() {
        System.out.println("Colocando a pizza na caixa oficial da loja");
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return name;
    }
}


