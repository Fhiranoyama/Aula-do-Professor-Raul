package aula2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
    private List<Aniversariante> lista;

    public MinhaAgendaDeAniversarios() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void adicionar(Aniversariante a) {
        lista.add(a);
    }

    @Override
    public void remover(Aniversariante a) {
        lista.remove(a);
    }

    @Override
    public Aniversariante buscar(String nome) {
        for (Aniversariante a : lista) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Aniversariante> listarTodos() {
        return lista;
    }
}