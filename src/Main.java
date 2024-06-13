import list.OperacoesBasicas.map.contatos.AgendaContatos;
import list.OperacoesBasicas.produtos.CadastroProdutos;

public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("guilherme", 1111111111);
        agendaContatos.adicionarContato("yasmin", 1111111144);
        agendaContatos.adicionarContato("filo", 1111111122);
        agendaContatos.adicionarContato("nariguda", 1111111133);

        agendaContatos.removerContato("filo");

        System.out.println(agendaContatos);
    }
}