import list.OperacoesBasicas.livros.CatalogoLivros;
import list.OperacoesBasicas.livros.Livro;

public class Main {
    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        Livro livro1 = new Livro("Scrum", "guilherme", 2012);
        Livro livro2 = new Livro("Soft skills", "felipe", 2001);
        Livro livro3 = new Livro("Sonhar", "yasmin", 2003);
        Livro livro4 = new Livro("HP", "guilherme", 2022);

        catalogoLivros.adicionarLivro(livro1);
        catalogoLivros.adicionarLivro(livro2);
        catalogoLivros.adicionarLivro(livro3);
        catalogoLivros.adicionarLivro(livro4);


        System.out.println(catalogoLivros);
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2011, 2025));


    }
}