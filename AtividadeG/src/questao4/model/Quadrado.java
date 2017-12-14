package questao4.model;

public class Quadrado extends FiguraGeometrica {

    public Quadrado(int ladoA) {
        super(ladoA);
    }

    @Override
    public int calculaPerimetro() {
        return getLadoA() * 4;
    }

    @Override
    public int calculaArea() {
        return getLadoA() * 2;
    }
}
