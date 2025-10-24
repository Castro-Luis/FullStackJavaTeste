package br.com.alura.pokemontcg.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCarta(@JsonAlias("nome") String name,
                         @JsonAlias("pv") Integer hp,
                         @JsonAlias("tipo") String types) {
}