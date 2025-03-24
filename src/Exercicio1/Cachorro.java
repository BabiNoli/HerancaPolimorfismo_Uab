package Exercicio1;

public class Cachorro extends Animal {



    public Cachorro() {
        super();
    }

    public Cachorro(String nome, String especie) {
        super.nome = nome;
        super.especie = especie;
    }

    public Cachorro(String nome, String cor, String especie, String raca) {
        super.nome = nome;
        super.cor = cor;
        super.especie = especie;
        this.raca = raca;
    }

    @Override
    public void registro(String nome, String cor, String especie, String raca) {
        super.registro(nome, cor, especie, raca);
        System.out.println("Canino registado com sucesso!");
        System.out.println("Nome: " + nome + "Cor: " + cor + "Especie: " + especie + "Raca: " + raca);
    }

    public void fazerSom(String especie) {
        super.fazerSom(especie);
        System.out.println(especie + " late: Au Au!");
    }

    public void fazerSom() {
        super.fazerSom();
        System.out.println("Cachorros latem: Au Au!");
    }

}
