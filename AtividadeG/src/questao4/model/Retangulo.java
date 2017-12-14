package questao4.model;

public class Retangulo  extends FiguraGeometrica {

    private int ladoB;

    public Retangulo(int ladoA, int ladoB) {
        super(ladoA);
        this.ladoB = ladoB;
    }

    @Override
    public int calculaPerimetro() {
        return (getLadoA() * 2) + (ladoB *2);
    }

    @Override
    public int calculaArea() {
        return getLadoA() * this.ladoB;
    }
}
