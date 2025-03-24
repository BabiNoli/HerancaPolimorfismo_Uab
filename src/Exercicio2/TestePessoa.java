package Exercicio2;

public class TestePessoa {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Rafael",15, "Realschue");
        Estudante estudante2 = new Estudante("Samuel",22, "Engenharia de Software");
        Estudante estudante3 = new Estudante("Maria",23, "Engenharia de Informatica");

        String nome = estudante1.getNome();
        System.out.println("Nome: " + nome);

        int idade = estudante1.getIdade();
        System.out.println("Idade: " + idade);

        String curso = estudante1.getCurso();
        System.out.println("Curso: " + curso);

        estudante2.mostrarInfo();
        estudante3.mostrarInfo();

       Pessoa aluna = new Pessoa("Laura", 42);
       aluna.mostrarInfo();
    }
}
