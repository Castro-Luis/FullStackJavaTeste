package br.com.alura.pokemontcg.principal;

import br.com.alura.pokemontcg.model.DadosCarta;
import br.com.alura.pokemontcg.service.ConsumoAPI;
import br.com.alura.pokemontcg.service.ConverteDados;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://api.pokemontcg.io/v2/cards?q=";
    private final String API_KEY = "&apikey=b3c8951b-690c-4e62-ac92-8b82efc78985";

    public void exibeMenu() {
        System.out.println("Digite o nome de um pokémon: ");
        var nomeCarta = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeCarta.replace(" ", "+") + API_KEY);
        DadosCarta dados = conversor.obterDados(json, DadosCarta.class);
        System.out.println(dados);

    }
}
