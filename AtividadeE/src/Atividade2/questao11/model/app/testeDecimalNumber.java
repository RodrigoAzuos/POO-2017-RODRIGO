package Atividade2.questao11.model.app;

import Atividade2.questao11.model.model.DecimalNumber;

public class testeDecimalNumber {

    public static void main(String[] args) {

        DecimalNumber decimalNumber = new DecimalNumber(14.7);

        System.out.println(decimalNumber.decimalPart()+ " | int "+decimalNumber.integerPart());
    }
}
