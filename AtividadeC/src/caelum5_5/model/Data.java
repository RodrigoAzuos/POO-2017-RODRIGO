package caelum5_5.model;

public class Data {

    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return this.dia+ "/" + this.mes + "/" + this.ano+ "\n";

    }
}

