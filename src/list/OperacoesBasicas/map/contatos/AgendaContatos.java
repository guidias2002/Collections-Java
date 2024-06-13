package list.OperacoesBasicas.map.contatos;

import list.OperacoesBasicas.contatos.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatos.isEmpty()) {
            agendaContatos.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatos);
    }

    public Integer pesquisarContatoPorNome(String nome) {
        Integer numeroTelefone = null;
        if(!agendaContatos.isEmpty()) {
            numeroTelefone = agendaContatos.get(nome);
        }
        return numeroTelefone;
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "agendaContatos=" + agendaContatos +
                '}';
    }
}
