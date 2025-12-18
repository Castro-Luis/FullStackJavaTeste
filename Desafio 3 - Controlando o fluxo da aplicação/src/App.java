import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World...");

        System.out.println("");

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }

        System.out.println("");

        System.out.print("Digite um número: ");
        int numero1 = leitura.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais.");
        } else if (numero1 > numero2) {
            System.out.println("Números diferentes e " + numero1 + " é maior.");
        } else {
            System.out.println("Números diferentes e " + numero2 + " é maior.");
        }

        System.out.println("");

        System.out.print("""Escolha uma opção:"");
    }
}