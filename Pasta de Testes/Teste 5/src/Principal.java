import Personagens.Barbaro;
import Personagens.Ladino;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Barbaro barbaro = new Barbaro();
        barbaro.setNome("Paul Wisbech");
        barbaro.setIdade(50);
        barbaro.exibirStatus();

        System.out.println();

        Ladino ladino = new Ladino();
        ladino.setNome("Kai");
        ladino.setIdade(22);
        ladino.exibirStatus();
    }
}