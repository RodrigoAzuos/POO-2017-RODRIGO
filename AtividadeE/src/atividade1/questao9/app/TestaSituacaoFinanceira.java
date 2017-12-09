package atividade1.questao9.app;

import atividade1.questao9.model.SituacaoFinanceira;

import javax.swing.*;

public class TestaSituacaoFinanceira {

    public static void main(String[] args) {

        SituacaoFinanceira situacaoFinanceira = new SituacaoFinanceira(200,300);

        JOptionPane.showMessageDialog(null,"Saldo: "+situacaoFinanceira.saldo());
    }
}
