//Exercício 2 - Lista de Produtos

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world.");

        System.out.println();

        var produto1 = new Produto();
        produto1.setNome("Wafer Bauducco");
        produto1.setPreco(3.79);

        var produto2 = new Produto();
        produto2.setNome("Lasanha Bolonhesa Seara");
        produto2.setPreco(14.90);

        var produto3 = new Produto();
        produto3.setNome("Waffle Forno de Minas");
        produto3.setPreco(13.90);

        var produto4 = new Produto();
        produto4.setNome("Bala de Goma Gomets");
        produto4.setPreco(3.49);

        var produto5 = new Produto();
        produto5.setNome("Desodorante Rexona");
        produto5.setPreco(22.90);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        listaDeProdutos.add(produto5);
        System.out.println("Total de produtos: " + listaDeProdutos.size());
        System.out.println("Produto mais caro: " + listaDeProdutos.get(4).getNome());

        System.out.println();

        //Exercício 3 - Lista de Livros

        var livro1 = new Livro();
        livro1.setTitulo("Harry Potter e a Pedra Filosofal");
        livro1.setAutor("J.K. Rowling");
        livro1.setAnoPublicacao(1997);

        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(livro1);
//        listaDeProdutos.add(produto2);
//        listaDeProdutos.add(produto3);
//        listaDeProdutos.add(produto4);
//        listaDeProdutos.add(produto5);
        System.out.println("Lista dos livros: " + listaDeLivros);
    }
}