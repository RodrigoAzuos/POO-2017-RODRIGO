package atividade1.questao9.model;

public class SituacaoFinanceira {
    private double valorCredito;
    private double valorDebto;

    public SituacaoFinanceira(double valorCredito, double valorDebto) {
        this.valorCredito = valorCredito;
        this.valorDebto = valorDebto;
    }

    public double saldo(){
        return this.valorCredito - this.valorDebto;
    }
}
