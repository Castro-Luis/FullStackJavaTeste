import Classes.Cavaleiro;
import Classes.Feiticeira;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Feiticeira feiticeira = new Feiticeira();
        feiticeira.setNome("Exilis Flavo");
        feiticeira.setIdade(550);
        feiticeira.exibirStatus();

        System.out.println();

        Cavaleiro cavaleiro = new Cavaleiro();
        cavaleiro.setNome("Marshall");
        cavaleiro.setIdade(30);
        cavaleiro.exibirStatus();
    }
}