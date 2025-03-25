package Exercicio5;

public class Pato implements IVoador, IAquatico {

    @Override
    public void nadar() {
        System.out.println("Pato nadando...");
    }

    @Override
    public void voar() {
        System.out.println("Pato voando...");
    }
}
