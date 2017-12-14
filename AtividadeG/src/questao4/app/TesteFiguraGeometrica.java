package questao4.app;

import questao4.model.Calcula;
import questao4.model.Quadrado;
import questao4.model.Retangulo;
import questao4.model.Triangulo;

public class TesteFiguraGeometrica {

    public static void main(String[] args) {

        Quadrado  quadrado = new Quadrado(4);
        Triangulo triangulo = new Triangulo(4,7,5);
        Retangulo retangulo = new Retangulo(10,20);

        System.out.println("Perimetro do quadrado: " + Calcula.calculaPerimetro(quadrado));
        System.out.println("Perimetro do triangulo: " + Calcula.calculaPerimetro(triangulo));
        System.out.println("Perimetro do retangulo: " + Calcula.calculaPerimetro(retangulo));

        System.out.println("Area do quadrado: " + Calcula.calculaArea(quadrado));
        System.out.println("Area do triangulo: " + Calcula.calculaArea(triangulo));
        System.out.println("Area do retangulo: " + Calcula.calculaArea(retangulo));
    }
}
