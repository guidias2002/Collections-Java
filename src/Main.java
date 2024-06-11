import list.OperacoesBasicas.ListaTarefas;
import list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("criar");
        listaTarefas.adicionarTarefa("rodar");
        listaTarefas.adicionarTarefa("atualizar");
        listaTarefas.adicionarTarefa("deletar");
        listaTarefas.adicionarTarefa("deletar");

        System.out.println(listaTarefas);
        listaTarefas.removerTarefa("deletar");

        listaTarefas.obterDescricoesTarefas();
    }
}