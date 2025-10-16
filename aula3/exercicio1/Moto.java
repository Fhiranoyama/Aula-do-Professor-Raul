package aula3.exercicio1;

public class Moto extends Veiculo {
  private int cilindradas;

  public Moto(String modelo, int ano, int cilindradas) {
    super(modelo, ano);
    this.cilindradas = cilindradas;
  }

  public int getCilindradas() {
    return cilindradas;
  }

  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }

  @Override
  public void imprimirDetalhes() {
    super.imprimirDetalhes();
    System.out.println("Cilindradas: " + this.cilindradas);
  }
}