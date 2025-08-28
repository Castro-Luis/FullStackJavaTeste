import Classes.Alquimista;
import Classes.Barbara;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Barbara barbara = new Barbara();
        barbara.nome = "Carmén";
        barbara.idade = 23;
        barbara.exibirStatus();

        System.out.println();

        Alquimista alquimista = new Alquimista();
        alquimista.nome = "Chen";
        alquimista.idade = 350;
        alquimista.exibirStatus();
    }
}