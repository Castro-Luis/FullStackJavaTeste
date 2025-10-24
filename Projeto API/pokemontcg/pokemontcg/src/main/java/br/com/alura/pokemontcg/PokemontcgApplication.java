package br.com.alura.pokemontcg;

import br.com.alura.pokemontcg.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokemontcgApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PokemontcgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
