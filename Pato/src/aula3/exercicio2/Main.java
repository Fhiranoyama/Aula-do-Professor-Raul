package aula3.exercicio2;

public class Main {
  public static void main(String[] args) {
    GerenteDeFiguras gerente = new GerenteDeFiguras();

    Triangulo t1 = new Triangulo(2.0, 3.0);
    gerente.adicionaFigura(t1);

    Losango l1 = new Losango(4.0, 5.0);
    Losango l2 = new Losango(6.0, 2.0);
    gerente.adicionaFigura(l1);
    gerente.adicionaFigura(l2);

    System.out.println("Figuras cadastradas:");
    gerente.imprimeFiguras();

    System.out.println("Maior área cadastrada: " + gerente.getMaiorAreaDeFigura());

    System.out.println("Área total de todas as figuras: " + gerente.getAreaTotal());
  }
}