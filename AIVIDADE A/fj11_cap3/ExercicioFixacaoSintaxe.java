public class ExercicioFixacaoSintaxe {

    public static void main(String[] args){

        imprimir();
        soma();
        multiplos();
        fatorial(9);
        opcional(13);


    }

    static void imprimir(){
        for (int i = 150; i < 300; i++)
            System.out.println(i);
    }
    static void soma(){
        int soma = 0;
        for(int i = 1; i < 1000;i++)
            soma += i;

        System.out.println("Soma de 1 a 1000 = "+ soma+ "\n");

    }

    static void multiplos(){
        System.out.print("Multiplos de 3\n ");
        for(int i = 1; i < 100;i++)
            if(i % 3 == 0)
                System.out.println(i);
    }

    static void fatorial(int fat){

        System.out.print("Fatorial de 1 a " + fat+"\n");
        int fatorial = 1;

        for(int i = 1; i <= fat;i++){
            if(i>2)
                fatorial *= i;
            if(i==2)
                fatorial *= i;
            System.out.println("Fatorial de "+i+ " = " + fatorial);

        }

    }

    static void opcional(int num){

        while (num > 1) {

            if (num % 2 == 0)
                num = num / 2;
            else
                num = 3 * num + 1;

            System.out.print(num + "->");
        }

    }


    }

