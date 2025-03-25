package Exercicio4;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro("Ford");
        Carro carro = new Carro("Fiat");

        veiculo.moverPara(4,6);
        carro.moverPara(2,5);
        System.out.println();
        veiculo.parar();
        carro.parar();
    }
}
