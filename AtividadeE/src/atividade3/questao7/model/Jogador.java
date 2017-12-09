package atividade3.questao7.model;

public class Jogador {

    private int forca;
    private int nivel;
    private int pontosAtuais;

    public Jogador(int forca, int nivel, int pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    public int calculaAtaque(){
        return this.forca * this.nivel;
    }

    public void atacar(Jogador jogador){
        jogador.pontosAtuais -= this.calculaAtaque();

    }

    public int pontos(){
        return this.pontosAtuais;
    }

}
