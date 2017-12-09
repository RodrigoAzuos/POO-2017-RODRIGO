package Atividade2.questao13.app;

import Atividade2.questao13.model.NumberUtils;

public class TesteNumberUtils {

    public static void main(String[] args) {

        NumberUtils numberUtils = new NumberUtils(10);

        System.out.println(numberUtils.isOdd());
        System.out.println(numberUtils.isPair());
        System.out.println(numberUtils.isPrime());
        System.out.println(numberUtils.printCount());
        System.out.println(numberUtils.printReverseCount());
    }
}
