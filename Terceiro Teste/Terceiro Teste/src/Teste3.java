import Personagens.*;

public class Teste3 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Curandeiro curandeiro = new Curandeiro();
        curandeiro.setNome("Haru");
        curandeiro.setIdade(24);
        curandeiro.setVida(100);
        curandeiro.setAtaque(10);
        curandeiro.exibirStatus();

        System.out.println();

        Ladina ladina = new Ladina();
        ladina.setNome("Yuffie");
        ladina.setIdade(28);
        ladina.setVida(100);
        ladina.setAtaque(10);
        ladina.exibirStatus();
    }
}