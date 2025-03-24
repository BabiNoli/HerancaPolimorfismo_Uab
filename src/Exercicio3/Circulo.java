package Exercicio3;

public class Circulo extends Forma {

    final double pi = 3.14159265359;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double areaCirculo = pi * (this.raio * this.raio);
        System.out.printf("Area: %.2f\n", areaCirculo);
        return areaCirculo;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

