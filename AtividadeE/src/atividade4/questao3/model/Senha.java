package atividade4.questao3.model;

public class Senha {

    private String valor;

    public Senha(String valor) {
        this.valor = valor;
    }

    public boolean iguais(String valor){
        return (this.valor.equals(valor))? true : false;
    }

    public boolean iguaisTrim(String valor){
        return (this.valor.trim().equals(valor.trim()))? true : false;
    }

    public boolean tamanhoSeguro(){
        return (this.valor.length() >= 6)? true : false;
    }

    public boolean possueMaiusculaMinuscula() {
        int contaMaiuscula = 0;
        int contaMinuscula = 0;
        for (int i = 0; i < this.valor.length(); i++){
            if (this.valor.charAt(i) >= 'A' && this.valor.charAt(i) <= 'Z' )
                contaMaiuscula++;
            else if(this.valor.charAt(i) >= 'a' && this.valor.charAt(i) <= 'z')
                contaMinuscula++;
        }

        return (contaMaiuscula > 0 && contaMinuscula > 0 )? true : false;
    }

    public boolean possueNumero(){
        for (int i = 0; i < this.valor.length(); i++){
            if (this.valor.charAt(i) >= '1' && this.valor.charAt(i) <= '9')
                return true;
        }
        return false;
    }

    public boolean ehValida(){
        return (this.tamanhoSeguro() && this.possueMaiusculaMinuscula() && this.possueNumero())? true : false;
    }


}
