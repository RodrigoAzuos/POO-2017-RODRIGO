package atividade1.questao7.app;

import atividade1.questao7.model.Retangulo;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;

public class TestaRetangulo {


    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(11,12);

        JOptionPane.showMessageDialog(null,"Perimetro: "+ retangulo.calculaPerimetro());
    }

}
