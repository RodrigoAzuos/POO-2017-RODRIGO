package atividade4.questao3.app;

import atividade4.questao3.model.Senha;

public class TestaSenha {

    public static void main(String[] args) {

        Senha senha1 = new Senha("rodrigo12");
        Senha senha2 = new Senha("rodrigo3");

        System.out.println("senha1: " + senha1.iguais("rodrigo12"));
        System.out.println("senha2: " +senha2.iguaisTrim("rodrigo3 "));

        System.out.println("tamanho seguro: " +senha2.tamanhoSeguro());
        System.out.println("maiuscula minuscula: " +senha2.possueMaiusculaMinuscula());

        System.out.println("possue numero " +senha2.possueNumero());

        System.out.println("é valida: " +senha2.ehValida());




    }
}
