import Classes.Curandeira;
import Classes.Mago;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        Curandeira curandeira = new Curandeira();
        curandeira.setNome("Aurora");
        curandeira.setIdade(18);
        curandeira.setSeTornouBoss(true);
        curandeira.exibirStatus();
        System.out.println("Se tornou boss? " + curandeira.isSeTornouBoss());

        System.out.println();

        Mago mago = new Mago();
        mago.setNome("Ito");
        mago.setIdade(45);
        mago.exibirStatus();
    }
}