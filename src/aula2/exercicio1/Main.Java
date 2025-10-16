package aula2.exercicio1;

public class Main {
  public static void main(String[] args) {
    MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

    Aniversariante a1 = new Aniversariante("Fábio", 24, 04);
    Aniversariante a2 = new Aniversariante("Ana", new DataAniversario(07, 10));

    agenda.adicionar(a1);
    agenda.adicionar(a2);

    System.out.println("Lista de aniversariantes:");
    for (Aniversariante a : agenda.listarTodos()) {
      System.out.println(a);
    }
  }
}