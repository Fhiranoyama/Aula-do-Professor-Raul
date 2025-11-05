package exercicio4;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();

    System.out.println("\n--- Mudando comportamento em tempo de execução ---");
    Duck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.performFly();
    rubberDuck.performQuack();

    // Alterando comportamento dinamicamente
    rubberDuck.setFlyBehavior(new FlyWithWings());
    rubberDuck.performFly();
  }
}