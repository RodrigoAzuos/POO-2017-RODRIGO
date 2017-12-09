package atividade1.questao7.model;

public class Retangulo {


    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double calculaArea(){
        return this.ladoA * this.ladoB;
    }

    public double calculaPerimetro(){
        return (this.ladoA + this.ladoB) * 2;
    }
}
