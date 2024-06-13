package list.OperacoesBasicas.produtos;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "produtosSet=" + produtosSet +
                '}';
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> ordenadoPorNome = new TreeSet<>(produtosSet);

        return ordenadoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> ordenadoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        ordenadoPorPreco.addAll(produtosSet);

        return ordenadoPorPreco;
    }


}
