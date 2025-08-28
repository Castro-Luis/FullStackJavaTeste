package Museu;

public abstract class Sala {
        private String nome;
        private String descricao;
        private int anoCriacao;

        Sala(String nome, String descricao, int anoCriacao) {
            this.nome = nome;
            this.descricao = descricao;
            this.anoCriacao = anoCriacao;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public abstract void exibirConteudo();
}
