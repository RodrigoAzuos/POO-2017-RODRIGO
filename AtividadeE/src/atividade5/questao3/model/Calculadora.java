package atividade5.questao3.model;

public class Calculadora {

    private int operador1;
    private int operador2;

    public Calculadora(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public int soma(){
        return this.operador1 + this.operador2;
    }

    public int subtracao(){
        return this.operador1 - this.operador2;
    }
}
