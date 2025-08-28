import Classes.Bruxa;
import Classes.Guerreiro;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Bruxa bruxa = new Bruxa();
        bruxa.setNome("Lídia Wisbech");
        bruxa.setIdade(52);
        bruxa.exibirStatus();

        System.out.println();

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setNome("Gray Garland");
        guerreiro.setIdade(54);
        guerreiro.exibirStatus();
    }
}