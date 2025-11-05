package aula2.exercicio1;

public class Aniversariante {
  private String nome;
  private DataAniversario data;

  public Aniversariante(String nome, int dia, int mes) {
    this.nome = nome;
    this.data = new DataAniversario(dia, mes);
  }

  public Aniversariante(String nome, DataAniversario data) {
    this.nome = nome;
    this.data = data;
  }

  public String getNome() {
    return nome;
  }

  public DataAniversario getData() {
    return data;
  }

  // Implementação do equals
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;

    Aniversariante outro = (Aniversariante) obj;
    return this.nome.equals(outro.nome) &&
        this.data.equals(outro.data);
  }

  @Override
  public String toString() {
    return nome + " - " + data;
  }
}