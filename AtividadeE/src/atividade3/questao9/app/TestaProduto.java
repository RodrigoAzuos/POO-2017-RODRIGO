package atividade3.questao9.app;

import atividade3.questao9.model.Produto;

public class TestaProduto {

    public static void main(String[] args) {

        Produto produto1 = new Produto(10,20,5);
        Produto produto2 = new Produto(10,20,5);

        System.out.println(produto1.reajusta(10));
        System.out.println(produto2.reajusta(10));

        System.out.println(produto1.equals(produto2));

        System.out.println(produto2.baixar(16));
        System.out.println(produto2.baixar(12));
    }
}
