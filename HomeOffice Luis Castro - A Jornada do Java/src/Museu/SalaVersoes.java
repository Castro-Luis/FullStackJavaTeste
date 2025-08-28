package Museu;

public class SalaVersoes extends Sala {
    private String recursosChave;
    public SalaVersoes(String nome, String descricao, int anoCriacao, String recursosChave) {
        super();
        this.recursosChave = recursosChave;
    }

    @Override
    public void exibirConteudo() {

    }
}