package Exercicio1;

public class Gato extends Animal {


    public Gato() {
        super();
    }

    public Gato(String nome, String especie) {
        super.nome = nome;
        super.especie = especie;
    }

    public Gato(String nome, String cor, String especie, String raca) {
        super.nome = nome;
        super.cor = cor;
        super.especie = especie;
        this.raca = raca;
    }

    @Override
    public void registro(String nome, String cor, String especie, String raca) {
        super.registro(nome, cor, especie, raca);
        System.out.println("Felino registado com sucesso!");
        System.out.println("Nome: " + nome + "Cor: " + cor + "Especie: " + especie + "Raca: " + raca);
    }

    @Override
    public void fazerSom(String especie) {
        super.fazerSom(especie);
        System.out.println( especie + " mia: Miau!");
    }

    public void fazerSom() {
        super.fazerSom();
        System.out.println("Gatos miam: Au Au!");
    }

}
