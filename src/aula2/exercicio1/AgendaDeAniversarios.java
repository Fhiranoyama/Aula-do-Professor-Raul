package aula2.exercicio1;

import java.util.List;

public interface AgendaDeAniversarios {
  void adicionar(Aniversariante a);

  void remover(Aniversariante a);

  Aniversariante buscar(String nome);

  List<Aniversariante> listarTodos();
}