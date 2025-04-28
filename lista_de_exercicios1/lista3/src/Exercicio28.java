public class Exercicio28 {
    public static void main(String [] args){
        /*
        Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200
         */

        System.out.println("Listando todos os números impares entre 100 e 200: ");

        int numeroCem = 100;

        while (numeroCem <= 200){
            if ( numeroCem % 2 == 1 ){
                System.out.println(numeroCem);
            }
            numeroCem++;
        }
    }
}
