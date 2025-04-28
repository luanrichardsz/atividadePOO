import java.util.Scanner;

public class Exercicio31 {
    public static void main(String [] args) {
        /*
        Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba
        ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o
        número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o fim
        dos dados.
        */

        Scanner sc = new Scanner(System.in);

        int numero, numeroPar = 0, numeroImpar = 0;

        System.out.println("\n===================== DESCUBRA =====================\n");

        do {
            System.out.print("\nDigite um número(negativo para parar): ");
            numero = sc.nextInt();

            if (numero == 0){

                System.out.println("\nO número é ZERO!");

            } else if (numero % 2 == 1){

                System.out.println("\nO número " + numero + " é impar!");
                numeroImpar += numero;

            } else if (numero % 2 == 0){

                System.out.println("\nO número " + numero + " é par!");
                numeroPar += numero;

            } else {

                System.out.println("\nO número é NEGATIVO! Somando todos os números.");
                System.out.println("\nA soma dos números pares é " + numeroPar);
                System.out.println("\nA soma dos números impares é " + numeroImpar);

            }

        } while (numero >= 0);
    }
}
