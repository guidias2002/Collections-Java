package list.OperacoesBasicas.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        agendaContatos.add(new Contato(nome, numeroTelefone));
    }

    public Set<Contato> exibirContatos() {
        return agendaContatos;
    }

    public Set<Contato> pesquisarPorNome(String nomeContato) throws ContatoNaoEncontradoException {
        Set<Contato> contatosProcurados = new HashSet<>();

        for(Contato contato : agendaContatos) {
            if(contato.getNome().startsWith(nomeContato)) {
                contatosProcurados.add(contato);
            }
        }

        if(contatosProcurados.isEmpty()) {
            throw new ContatoNaoEncontradoException("Contato não encontrado com o nome: " + nomeContato);
        }

        return contatosProcurados;
    }

    public Contato atualizarNumeroContato(String nome, int numeroTelefone) {
        Contato contatoAtualizarNumero = null;

        for(Contato contato : agendaContatos) {
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumeroTelefone(numeroTelefone);
                contatoAtualizarNumero = contato;

                break;
            }
        }
        return contatoAtualizarNumero;
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "agendaContatos=" + agendaContatos +
                '}';
    }
}
