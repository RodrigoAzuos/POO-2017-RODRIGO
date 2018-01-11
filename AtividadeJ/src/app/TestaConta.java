package app;

import Exceptions.SaldoInsuficienteException;
import Model.Conta;

import javax.swing.*;

public class TestaConta {

    public static void main(String[] args) {

        Conta conta = new Conta();

        try {

            conta.depositar(-10);
            System.out.println("Valor depositado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {

            conta.depositar(300);
            System.out.println("Valor depositado");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo :" + conta.getSaldo());

        try {

            conta.sacar(-10);
            System.out.println("Valor sacado");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }

        System.out.println("Saldo :" + conta.getSaldo());

        try {

            conta.sacar(600);
            System.out.println("Valor sacado");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }

        System.out.println("Saldo :" + conta.getSaldo());

        try {
            conta.sacar(250);
            System.out.println("Valor sacado");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
        }

        System.out.println("Saldo :" + conta.getSaldo());
    }

}
