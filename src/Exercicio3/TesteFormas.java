package Exercicio3;


public class TesteFormas {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2.45);
        Retangulo retangulo = new Retangulo(4.50, 6.20);

        circulo.calcularArea();
        retangulo.calcularArea();

        double raio = circulo.getRaio();
        System.out.println("Raio: " + raio);

        double altura = retangulo.getAltura();
        System.out.println("Altura: " + altura);

        circulo.setRaio(5.3);
        System.out.println("Raio Circulo: " + circulo.getRaio());

        double largura = retangulo.getLargura();
        System.out.println("Largura: " + largura);

        retangulo.setLargura(5.7);
        System.out.println("Retângulo: " + retangulo.getLargura());

        Circulo circulo2 = new Circulo(4.45);
        System.out.printf("Area do Circulo: %.2f\n", circulo2.calcularArea());
    }
}
