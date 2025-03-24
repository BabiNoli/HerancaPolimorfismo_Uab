package Exercicio2;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super.nome = nome;
        super.idade = idade;
        this.curso = curso;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + super.nome + "\nIdade: " + super.idade + "\nCurso: " + this.curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
