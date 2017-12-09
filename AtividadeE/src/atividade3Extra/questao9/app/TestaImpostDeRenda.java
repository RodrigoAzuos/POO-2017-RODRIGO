package atividade3Extra.questao9.app;

import atividade3Extra.questao9.model.ImpostoDeRenda;

public class TestaImpostDeRenda {
    public static void main(String[] args) {
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda(2000);

        System.out.println(impostoDeRenda.calculaImposto());
        System.out.println(impostoDeRenda.calculaRendaLiquida());
    }


}
