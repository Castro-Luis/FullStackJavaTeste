public class CalculadoraIMC {
    public static void main(String[] args) {
        System.out.println("Hello, world...");

        System.out.println("---");

        double peso = 80.3;
        double altura = 1.69;

        double imc = peso / (altura * altura);

        System.out.println(String.format("O cálculo do IMC é: %.2f", imc));
    }
}
