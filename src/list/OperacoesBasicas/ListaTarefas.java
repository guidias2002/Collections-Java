package list.OperacoesBasicas;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> listaTarefaParaRemover = new ArrayList<>();
        for(Tarefa tarefa : listaTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefaParaRemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(listaTarefaParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        for(Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa.getDescricao());
        }
    }

    @Override
    public String toString() {
        return "listaTarefas=" + listaTarefas;
    }
}
