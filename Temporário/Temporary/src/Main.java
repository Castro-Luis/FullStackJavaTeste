import Package.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println();

        Barbaro barbaro = new Barbaro();
        barbaro.nome = "Conan";
        barbaro.idade = 30;
        barbaro.exibirStatus();

        System.out.println();

        Maga maga = new Maga();
        maga.nome = "Nome: Delta";
        maga.idade = "Idade: 35";
        maga.tipoDeCombate = "Tipo de Combate: Quântico";
        maga.caminho = "Caminho: A Erudição";
        maga.faccao = "Facção: Sociedade dos Gênios";
        maga.assinatura = "Assinatura: Em busca de paz nas bibliotecas";
        maga.descricao = """
                Autodenominada Delta, é membro da Sociedade dos Gênios e também
                emanadora da Erudição. Gosta de ler livros e adquirir mais conhecimento
                para continuar seus projetos em parceria com alguns outros membros da
                Sociedade dos Gênios, como A Herta e Ruan Mei.
                Atualmente está em busca do mistério que envolve o mundo de Amphoreus,
                buscando um jeito de entrar lá e desvendar os segredos do mesmo.
                """;
        maga.exibirStatus();

        System.out.println();

        Ladino ladino = new Ladino();
        ladino.nome = "Nome: Kai";
        ladino.idade = "Idade: 24";
        ladino.tipoDeCombate = "Tipo de Combate: A Caça";
        ladino.caminho = "Caminho: A Caça";
        ladino.faccao = "Facção: Caçadores de Stellaron";
        ladino.assinatura = """
                Assinatura: Eu não preciso provar nada a ninguém... Desde que não me
                provoque.
                """;
        ladino.descricao = """
                Preguiçoso, mas eficaz. Kai é membro dos Caçadores de Stellaron que vive
                com as mãos no bolso e flutua sob o chão sempre que pode, deixando o
                trabalho para o seu cachecol e o vento que lhe acompanha.
                Segue estritamente o "roteiro", fazendo o que deve ser feito, usando os Fura-Ventos
                se caso necessário e logo vai embora sem pestanejar.
                Aparentemente, tem uma conexão profunda com Astro, também membro
                dos Caçadores de Stellaron.
                """;
        ladino.exibirStatus();
    }
}