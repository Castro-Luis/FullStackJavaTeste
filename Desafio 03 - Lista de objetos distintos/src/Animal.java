// Desafio 2

public class Animal {
    private String raca;
    private String porte;
    private int tamanho;

    public Animal(String raca, String porte, int tamanho) {
        this.raca = raca;
        this.porte = porte;
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void exibirCaracteristicas() {
        System.out.println("Nome da raça: " + raca);
        System.out.println("Porte escolhido: "+ porte);
        System.out.println("Tamanho médio: " + tamanho);
    }
}
