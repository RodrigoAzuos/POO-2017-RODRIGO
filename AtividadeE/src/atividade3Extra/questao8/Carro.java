package atividade3Extra.questao8;

public class Carro {
    String placa;
    long chassi;
    String modelo;
    String ano;

    public Carro(String placa, long chassi, String modelo, String ano) {
        this.placa = placa;
        this.chassi = chassi;
        this.modelo = modelo;
        this.ano = ano;
    }

    boolean clonado(Carro c) {
        return (c.chassi == this.chassi && c.placa == this.placa)? true : false;
    }
}