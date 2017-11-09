public class Main {

    public static void main(String[] args){

        Data dataEntrada1 = new Data(9,11,2017);
        Data dataEntrada2 = new Data(10,11,2017);


        Funcionario f1 = new Funcionario("rodrigo","TI", 1200
                ,dataEntrada1, "3424530");

        Funcionario f2 = new Funcionario("Ruan","ADM", 1700
                ,dataEntrada2, "3483730");


        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        System.out.println("Funcionario f1 está " +f1.isActive());
        System.out.println(f1.toString());
        f1.recebeAumennto(200);

        System.out.println(f1.toString());

        System.out.println("Ganho anual de f1: "+f1.calculaGanhoAnual());

        System.out.println(f2.toString());

        f2.demitir();
        System.out.println("Funcionario f1 está " + f2.isActive());
    }
}
