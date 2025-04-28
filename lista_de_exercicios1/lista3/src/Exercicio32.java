import java.util.Scanner;

public class Exercicio32 {
    public static void main(String [] args){
        /*
        Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos
        ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.
        */

        Scanner sc = new Scanner(System.in);

        int numero, numeroAtual;

        System.out.println("\n===================== DESCUBRA =====================\n");

        do {
            System.out.print("Digite um número(de 1 a 10): ");
            numero = sc.nextInt();

            if (numero >= 1 && numero <= 10 ){
                int soma = 0;

                if (numero % 2 == 1){
                    numeroAtual = numero;
                } else {
                    numeroAtual = numero + 1;
                }

                for (int i = 1; i <= 20; i++){
                    soma += numeroAtual * numeroAtual;
                    numeroAtual += 2;
                    System.out.println(numeroAtual);
                }

                System.out.println("\nA soma dos quadrados dos 20 primeiros números impares a partir de " + numero +  " é: " + soma);
            } else {
                System.out.println("\nDigite um número valido!\n");
            }

        } while (numero < 1 || numero > 10);
    }
}
