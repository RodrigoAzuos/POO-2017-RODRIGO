package Atividade2.questao10.model;

public class Soma {

    private double numero1;
    private double numero2;

    public Soma(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double calculaSoma(){
        return this.numero1 + this.numero2;
    }
}
