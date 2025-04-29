public class Exercicio35 {
    public static void main(String [] args){
        /*
         Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10".
         */

        for (int i = 1; i <= 100; i++){
            System.out.println(i);

            if (i % 10 == 0){
                System.out.println("Múltiplo de 10");
            }
        }
    }
}
