//Desafio 1

import PacoteProdutos.Produto;
import PacoteProdutos.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello, world...");

        //Desafio 3

        var produto1 = new Produto("Óleo de cozinha", 8.29, 5);

        var produto2 = new Produto("Jarra de vidro", 12.99, 1);

        var produto3 = new Produto("Donuts", 5.99, 12);

        var produto4 = new ProdutoPerecivel("Arroz Tio João", 7.49, 3);

        //Desafio 1 - Continuação

        System.out.println();

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto selecionado: " + listaDeProdutos.get(2).getNome());

        //Desafio 2

        System.out.println(listaDeProdutos);
    }
}