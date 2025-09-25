// Desafio 2

public class Cachorro extends Animal {

    private boolean abanaRabo;

    public Cachorro(String raca, String porte, int tamanho, boolean abanaRabo) {
        super(raca, porte, tamanho);
    }

    public boolean isAbanaRabo() {
        return abanaRabo;
    }

    public void setAbanaRabo(boolean abanaRabo) {
        this.abanaRabo = abanaRabo;
    }
}
