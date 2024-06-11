package list.OperacoesBasicas.pessoas;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }


}
