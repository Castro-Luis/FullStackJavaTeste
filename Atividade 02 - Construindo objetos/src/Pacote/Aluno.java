package Pacote;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        super(nome, idade, matricula, curso);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}