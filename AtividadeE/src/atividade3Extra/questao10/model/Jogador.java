package atividade3Extra.questao10.model;

public class Jogador {

    private int vida;

    public Jogador() {
        this.vida = 5;
    }

    public boolean isLimiteMaxVida(){
        return (this.vida == 5)? true : false;
    }

    public boolean isLimiteMinVida(){
        return (this.vida == 0)? true : false;
    }

    public void upVida(){
        if(!isLimiteMaxVida())
            this.vida++;
    }

    public void downVida(){
        if(!isLimiteMinVida())
            this.vida--;
    }

    public void doarVida(Jogador jogador){
        this.downVida();
        jogador.upVida();
    }






}
