package Atividade2.questao7and8.app;

import Atividade2.questao7and8.model.Saldacao;

public class TestarSaldacao {

    public static void main(String[] args) {

        Saldacao saldacao = new Saldacao("Bom dia", "Rodrigo");

        System.out.println(saldacao.obterSaldacao());
    }
}
