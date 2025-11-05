package exercicio4;

public class RubberDuck extends Duck {
  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("Sou um pato de borracha!");
  }
}