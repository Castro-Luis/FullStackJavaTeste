package Museu;

public class Visitante {
        private String nome;
        private int idade;

        public Visitante(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void explorarSala(Sala sala) {
            sala.exibirConteudo();
        }
}