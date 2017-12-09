package Atividade2.questao15;

import Atividade2.questao14.Equipamento;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento1 = new Equipamento();
        Equipamento equipamento2 = new Equipamento();

        System.out.println("Equipamento 1: " +equipamento1.liga());
        System.out.println("Equipamento 2: " +equipamento2.desliga());

        System.out.println("Equipamento 1: " +equipamento1.inverter());
        System.out.println("Equipamento 2: " +equipamento2.inverter());

        System.out.println("Equipamento 1 está ligado? " +equipamento1.estaLigado());
        System.out.println("Equipamento 2 está ligado?: " +equipamento2.estaLigado());

    }





}
