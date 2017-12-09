package Atividade2.questao14;

public class Equipamento {

    private boolean ligado;

    public Equipamento() {
    }

    public String liga(){
        if (!estaLigado())
            this.ligado = true;
        return "Equipamento ligado";
    }

    public String desliga(){
        if(estaLigado())
            this.ligado = false;
        return "Equipamento desligado";
    }

    public String inverter(){
        if(this.estaLigado()){
            this.ligado = false;
            return "Equipamento desligado";
        }else {
            this.ligado = true;
            return "Equipamento ligado";
        }

    }

    public boolean estaLigado(){
        return this.ligado;
    }
}
