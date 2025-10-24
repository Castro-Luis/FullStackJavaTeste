package br.com.alura.pokemontcg.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
