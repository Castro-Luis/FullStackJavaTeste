import Museu.Sala;
import Museu.SalaFundadores;
import Museu.Visitante;

public class Main {
    public static void main(String[] args) {
        Visitante visitante = new Visitante("Freya", 22);
        System.out.println("Visitante: " + visitante);

        Sala salaFundadores = new SalaFundadores();
    }
}