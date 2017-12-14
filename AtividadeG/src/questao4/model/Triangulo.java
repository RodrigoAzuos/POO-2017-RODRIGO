package questao4.model;

public class Triangulo extends FiguraGeometrica {

    private int ladoB;
    private int ladoc;

    public Triangulo(int ladoA, int ladoB, int ladoc) {
        super(ladoA);
        this.ladoB = ladoB;
        this.ladoc = ladoc;
    }

    @Override
    public int calculaPerimetro() {
        return super.getLadoA() + this.ladoB + this.ladoc;
    }

    @Override
    public int calculaArea() {
        // ta errado não é assim, sabemos.
        return this.ladoc * this.ladoB;
    }
}
