import Package.*;

public class Personagens {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println();

        Barbara barbara = new Barbara();
        barbara.setNome("Nome: Carmén");
        barbara.setIdade("Idade: 22");
        barbara.setCaminho("Caminho: A Destruição");
        barbara.setElemento("Fogo");
        barbara.exibirStatus();

        System.out.println();

        Barda barda = new Barda();
        barda.nome = "Nome: Rita";
        barda.idade = "Idade: 17";
        barda.caminho = "Caminho: A Harmonia";
        barda.elemento = "Elemento: Raio";
        barda.exibirStatus();

        System.out.println();

        Cacadora cacadora = new Cacadora();
        cacadora.nome = "Itsuki Tori";
        cacadora.idade = "Idade: 16";
        cacadora.caminho = "Caminho: A Caça";
        cacadora.elemento = "Elemento: Fogo";
        cacadora.exibirStatus();

        System.out.println();

        Cavaleiro cavaleiro = new Cavaleiro();
        cavaleiro.nome = "Nome: Marshall";
        cavaleiro.idade = "Idade: 25";
        cavaleiro.caminho = "Caminho: A Erudição";
        cavaleiro.elemento = "Elemento: Gelo";
        cavaleiro.exibirStatus();

        System.out.println();

        Curandeiro curandeiro = new Curandeiro();
        curandeiro.nome = "Nome: Sylvie";
        curandeiro.idade = "Idade: 28";
        curandeiro.caminho = "Caminho: A Abundância";
        curandeiro.elemento = "Elemento: Vento";
        curandeiro.exibirStatus();

        System.out.println();

        Escudeira escudeira = new Escudeira();
        escudeira.nome = "Nome: Freya Shamone";
        escudeira.idade = "Idade: 23";
        escudeira.caminho = "Caminho: A Preservação";
        escudeira.elemento = "Elemento: Fogo";
        escudeira.exibirStatus();

        System.out.println();

        Invocadora invocadora = new Invocadora();
        invocadora.nome = "Nome: Ishii Yuna";
        invocadora.idade = "Idade: 13";
        invocadora.caminho = "Caminho: A Recordação";
        invocadora.elemento = "Elemento: Imaginário";
        invocadora.exibirStatus();

        System.out.println();

        Ladino ladino = new Ladino();
        ladino.nome = "Nome: Cyan";
        ladino.idade = "Idade: 20";
        ladino.caminho = "Caminho: A Caça";
        ladino.elemento = "Elemento: Raio";
        ladino.exibirStatus();

        System.out.println();

        Mago mago = new Mago();
        mago.nome = "Nome: Ito Kenji";
        mago.idade = "Idade: 45";
        mago.caminho = "Caminho: A Inexistência";
        mago.elemento = "Elemento: Quântico";
        mago.exibirStatus();

        System.out.println();

        Necromante necromante = new Necromante();
        necromante.nome = "Nome: Lu Younling";
        necromante.idade = "Idade: ???";
        necromante.caminho = "Caminho: A Inexistência";
        necromante.elemento = "Elemento: Vento";
        necromante.exibirStatus();

    }
}