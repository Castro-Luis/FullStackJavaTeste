package Package;

public class Barbara {
    private String nome;
    private String idade;
    private String caminho;
    private String elemento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void exibirStatus() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(caminho);
        System.out.println(elemento);
    }
}