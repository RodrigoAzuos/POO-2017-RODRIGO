package atividade4.questao4.app;

import atividade4.questao4.model.Pilha;

public class TestarPilha {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.empilhar(2);

        System.out.print(pilha.exibir());
        pilha.empilhar(2);
        pilha.empilhar(4);
        pilha.empilhar(5);
        System.out.print(pilha.exibir());
        pilha.desempilhar();
        System.out.print(pilha.exibir());
        System.out.println("Esta cheia: " + pilha.estaCheia());

        pilha.empilhar(10);
        pilha.empilhar(11);
        System.out.print(pilha.exibir());
        System.out.println("Esta cheia: " + pilha.estaCheia());

    }
}
