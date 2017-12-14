package questao4.model;

public abstract class FiguraGeometrica {

    private int ladoA;

    public FiguraGeometrica(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoA() {
        return ladoA;
    }

    public abstract int calculaPerimetro();

    public abstract int calculaArea();
}
