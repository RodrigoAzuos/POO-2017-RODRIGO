package Atividade2.questao11.model.model;

public class DecimalNumber {

    private double numero;

    public DecimalNumber(double numero) {
        this.numero = numero;
    }

    public int integerPart(){
        return (int)this.numero;
    }

    public double decimalPart(){
        return this.numero - this.integerPart();
    }

}
