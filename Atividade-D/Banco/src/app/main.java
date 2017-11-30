package app;

import jdk.nashorn.internal.scripts.JO;
import model.*;

import javax.swing.*;
public class main {



    public static void main(String[] args) {

        Conta contaSelecionada = null;

        Banco banco = new Banco("Piaui", 323421, 20);
        AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.01);

        while (true){
            String opcao = JOptionPane.showInputDialog(null, menu());
            switch (opcao){
                case "1":
                    String tipo = " ";
                    tipo = JOptionPane.showInputDialog(null, "Digite o tiop de conta 1 poupança || 2 corrente");
                    JOptionPane.showMessageDialog(null,banco.adcionaConta(adcionar(tipo)));
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Total de contas: " + banco.getTotalDeContas());
                    break;
                case  "3":
                    String contas = "";
                    String op = " ";
                    contas = banco.getContas();
                    op = JOptionPane.showInputDialog(null,"Selecione sua conta pelo código\n" + contas);
                    contaSelecionada = banco.getConta(Integer.parseInt(op));
                    break;
                case "4":
                    if (contaSelecionada != null)
                        JOptionPane.showMessageDialog(null, "Saldo: " +contaSelecionada.getSaldo());
                    else
                        JOptionPane.showMessageDialog(null, "Selecione a conta");
                    break;
                case "5":
                    double valor = 0;
                    if (contaSelecionada != null){
                        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: " ));
                        contaSelecionada.depositar(valor);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Selecione a conta");
                    break;
                case "6":
                    Conta conta;
                    contas = banco.getContas();
                    int cn;
                    valor = 0;
                    if (contaSelecionada != null){
                        cn =  Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione a conta que deseja tranferir (pelo código)\n" + contas));
                        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: " ));
                        conta = banco.getConta(cn);
                        JOptionPane.showMessageDialog(null,contaSelecionada.trasferir(conta,valor));

                    }
                    else
                        JOptionPane.showMessageDialog(null, "Selecione a conta");
                    break;

                case "7":
                    if (contaSelecionada != null){
                        valor = 0;
                        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: " ));
                        contaSelecionada.sacar(valor);
                        JOptionPane.showMessageDialog(null, "Saldo: " + contaSelecionada.getSaldo());
                    }

                    else
                        JOptionPane.showMessageDialog(null, "Selecione a conta");
                    break;
                case "8":
                    if (contaSelecionada != null){
                        JOptionPane.showMessageDialog(null, atualizadorDeContas.roda(contaSelecionada));

                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Selecione a conta");
                    }
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Saldo total: " + atualizadorDeContas.getSaldoTotal());
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Bye Bye see you!");
            }

        }

        //TODO Fazer menu de um banco com Adiciona conta, ver quantidade de contas, seleciona conta(com listagem).
        //TODO depois que selecionar a conta podemos ver saldos e fazer depositos tranferencias etc,

    }

    public static String menu(){
        String menu = "1 Abrir conta\n" +
                "2 Ver quantidade de contas\n" +
                "3 Selecionar conta\n" +
                "4 Ver saldo\n" +
                "5 Depositar\n" +
                "6 Transferir\n" +
                "7 Sacar\n" +
                "8 Atualiza conta\n" +
                "9 Ver valor total";

        return menu;
    }

    public  static Conta adcionar(String tipo){
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome");
        String cpf = JOptionPane.showInputDialog(null,"Digite seu cpf");
        String rg = JOptionPane.showInputDialog(null,"Digite seu RG");
        String data = JOptionPane.showInputDialog(null,"Digite sua data de nascimento (00/00/0000)");
        String[] dtnasc = data.split("/");

        int dia = 0;
        int mes = 0 ;
        int ano = 0 ;
        long cpfLong = 0;
        int rgInt = 0;
        Pessoa pessoa;
        Conta conta;


        dia = Integer.parseInt(dtnasc[0]);
        mes = Integer.parseInt(dtnasc[1]);
        ano = Integer.parseInt(dtnasc[2]);
        cpfLong = Long.parseLong(cpf);
        rgInt = Integer.parseInt(rg);

        pessoa = new Pessoa(nome,cpfLong,rgInt,new Data(dia,mes,ano));
        if(tipo.equals("1")){
            conta = new ContaCorrente(pessoa);
            return conta;
        }
        else if (tipo.equals("2")){

            conta = new ContaPoupanca(pessoa);
            return conta;
        }

        return null;

    }
}

