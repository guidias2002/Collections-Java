package list.OperacoesBasicas.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutorProcurado = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutorProcurado.add(livro);
                }
            }
        }
        return livrosPorAutorProcurado;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAno.add(livro);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroProcurado =  null;

        for(Livro livro : livroList) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroProcurado = livro;
                break;
            }
        }
        return livroProcurado;
    }

    @Override
    public String toString() {
        return "livroList{" +
                "livroList=" + livroList +
                '}';
    }
}
