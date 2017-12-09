package atividade5.questao3.app;

import atividade5.questao3.model.Calculadora;

public class TestaCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(10,20);

        System.out.println(calculadora.soma());
        System.out.println(calculadora.subtracao());

    }
}
