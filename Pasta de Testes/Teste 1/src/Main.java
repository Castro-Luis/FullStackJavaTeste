import Classes.Mago;
import Classes.Suporte;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Mago mago = new Mago();
        mago.nome = "Ito Kenji";
        mago.idade = 45;
        mago.exibirStatus();

        System.out.println();

        Suporte suporte = new Suporte();
        suporte.nome = "Leyla";
        suporte.idade = 22;
        suporte.exibirStatus();
    }
}