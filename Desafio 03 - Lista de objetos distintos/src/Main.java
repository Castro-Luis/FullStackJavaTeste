// Desafio 1

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world");

        var cachorro = new Cachorro("Poodle", "Médio", 45, true);

        System.out.println();

        ArrayList nomes = new ArrayList();
        nomes.add("Nikara");
        nomes.add("Fang");
        nomes.add("Rosetta");
        nomes.forEach(System.out::println);

//        nomes.forEach(nome -> System.out.println(nome));
    }
}