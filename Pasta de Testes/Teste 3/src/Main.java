import Classes.Bruxa;
import Classes.Suporte;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Suporte suporte = new Suporte();
        suporte.nome = "Maya Cooper";
        suporte.idade = 21;
        suporte.exibirStatus();

        System.out.println();

        Bruxa bruxa = new Bruxa();
        bruxa.nome = "Nikara Kiyoko";
        bruxa.idade = 20;
        bruxa.exibirStatus();
    }
}