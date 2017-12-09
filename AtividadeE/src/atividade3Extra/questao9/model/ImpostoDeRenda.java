package atividade3Extra.questao9.model;

public class ImpostoDeRenda {

    private double rendaBruta;

    public ImpostoDeRenda(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double calculaImposto(){
        return (this.rendaBruta <= 1000)? this.rendaBruta * 0.05 : this.rendaBruta * 0.1;
    }

    public double calculaRendaLiquida(){
        return this.rendaBruta - this.calculaImposto();
    }
}
