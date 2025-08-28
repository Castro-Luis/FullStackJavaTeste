import Classes.Escudeira;
import Classes.Paladino;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Paladino paladino = new Paladino();
        paladino.setNome("Claus");
        paladino.setIdade(17);
        paladino.exibirStatus();

        System.out.println();

        Escudeira escudeira = new Escudeira();
        escudeira.setNome("Astro");
        escudeira.setIdade(0);
        escudeira.exibirStatus();
    }
}