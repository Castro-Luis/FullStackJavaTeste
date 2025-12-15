import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World...");

        System.out.println("---");

        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int chute = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 10: ");
            chute = leitura.nextInt();
            tentativas++;

            if (chute == numeroAleatorio) {
                System.out.println("Você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (chute < numeroAleatorio) {
                System.out.println("O número aleatório é maior.");
            } else {
                System.out.println("O número aleatório é menor.");
            }

            if (tentativas == 5 && chute != numeroAleatorio) {
                System.out.println("Infelizmente, você não conseguiu acertar o número em 5 tentativas. O número aleatório era: " + numeroAleatorio);
            }
        }
    }
}

/*

Algumas informações sobre o código

Diferença entre print e println:
- print: Imprime o texto na tela e mantém o cursor na mesma linha.
- println: Imprime o texto na tela e move o cursor para a próxima
linha.

*/