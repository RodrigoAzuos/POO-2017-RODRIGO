package atividade3Extra.questao10.app;


import atividade3Extra.questao10.model.Jogador;

public class TestaJogador {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador1.upVida();
        System.out.println(jogador1.isLimiteMaxVida());
        System.out.println(jogador2.isLimiteMinVida());

        jogador2.downVida();

        jogador1.doarVida(jogador2);

        System.out.println(jogador1.isLimiteMaxVida());
        System.out.println(jogador2.isLimiteMaxVida());
    }
}
