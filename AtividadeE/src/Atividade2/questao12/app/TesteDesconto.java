package Atividade2.questao12.app;

import Atividade2.questao12.model.Desconto;

public class TesteDesconto {

    public static void main(String[] args) {

        Desconto desconto = new Desconto(120,10);

        System.out.println(desconto.calcula());
    }
}
