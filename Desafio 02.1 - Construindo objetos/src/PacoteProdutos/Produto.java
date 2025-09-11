//Desafio 1

package PacoteProdutos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Desafio 3

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Desafio 1 - Continuação

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Desafio 2

    @Override
    public String toString() {
        return "PacoteProdutos : " + this.getNome() + " (" + this.getPreco() + " - "+ this.getQuantidade() + ")";
    }
}
