public class BalancoTrimestral {

    public static void main(String[] args){

        int gastoJaneiro = 1500;
        int gastofevereiro = 2300;
        int gastomarco = 1700;

        int gastoTrimestre = gastoJaneiro + gastofevereiro +gastomarco;

        System.out.println("Gasto no trimestre: " + gastoTrimestre);

        int mediaMensal = gastoTrimestre/ 3;

        System.out.println("Valor da média mensal = "+ mediaMensal);
    }
}
