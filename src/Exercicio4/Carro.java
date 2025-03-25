package Exercicio4;

public class Carro extends Veiculo {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void parar() {
        System.out.println("O " + getModelo() + " parou na posição " + getPosX() + ", " + getPosY() );
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
