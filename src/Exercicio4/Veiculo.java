package Exercicio4;

public class Veiculo implements IMovimentavel {
    private int posX;
    private int posY;

    @Override
    public void moverPara(int x, int y) {
        setPosX(x);
        setPosY(y);
        System.out.println("Mover o veiculo para a posição: " + getPosX() + ", " + getPosY());
    }

    @Override
    public void parar() {
        System.out.println("Parar o veiculo na posição: " + getPosX() + ", " + getPosY());

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
