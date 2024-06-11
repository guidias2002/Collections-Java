package list.OperacoesBasicas.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        carrinhoDeCompras.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemoverDaLista = new ArrayList<>();
        for(Item item : carrinhoDeCompras) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemoverDaLista.add(item);
            }
        }
        carrinhoDeCompras.removeAll(itensParaRemoverDaLista);
    }

    public double calcularValorTotal() {
        double valorTotalCarrinho = 0;

        for(Item item : carrinhoDeCompras) {
            double valorItemXQuantidade = item.getQuantidade() * item.getPreco();
            valorTotalCarrinho += valorItemXQuantidade;
        }
        return valorTotalCarrinho;
    }

    public void exibirItens() {
        for(Item item : carrinhoDeCompras) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhoDeCompras=" + carrinhoDeCompras +
                '}';
    }
}
