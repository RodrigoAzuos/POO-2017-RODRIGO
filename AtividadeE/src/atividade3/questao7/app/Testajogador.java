package atividade3.questao7.app;

import atividade3.questao7.model.Jogador;

public class Testajogador {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(5,2,100);
        Jogador jogador2 = new Jogador(5,2,100);

        jogador1.atacar(jogador2);

        System.out.println(jogador2.pontos());
    }
}
