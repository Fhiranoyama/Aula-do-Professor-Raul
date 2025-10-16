package aula3.exercicio1;

public class Carro extends Veiculo {
  private int numPortas;

  public Carro(String modelo, int ano, int numPortas) {
    super(modelo, ano);
    this.numPortas = numPortas;
  }

  public int getNumPortas() {
    return numPortas;
  }

  public void setNumPortas(int numPortas) {
    this.numPortas = numPortas;
  }

  @Override
  public void imprimirDetalhes() {
    super.imprimirDetalhes();
    System.out.println("N° de portas: " + this.numPortas);
  }
}