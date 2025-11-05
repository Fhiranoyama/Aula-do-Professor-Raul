package aula2.exercicio1;

public class Main {
  public static void main(String[] args) {
    MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

    Aniversariante a1 = new Aniversariante("Israel", 13, 01);
    Aniversariante a2 = new Aniversariante("Isaac", new DataAniversario(07, 10));

    agenda.adicionar(a1);
    agenda.adicionar(a2);

    System.out.println("Lista de aniversariantes:");
    for (Aniversariante a : agenda.listarTodos()) {
      System.out.println(a);
    }
  }
}