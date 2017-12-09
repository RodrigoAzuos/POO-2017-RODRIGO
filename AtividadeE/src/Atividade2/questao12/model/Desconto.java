package Atividade2.questao12.model;

public class Desconto {

    private double valor;
    private double desconto;

    public Desconto(double valor, double desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcula(){
        return this.valor *(1-this.desconto/100);
    }
}
