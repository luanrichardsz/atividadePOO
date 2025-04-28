import java.util.Scanner;

public class Exercicio27 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia:
            - a quantidade de números que deverá processar;
            - os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial. Lembrete:
            O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
         */

        Scanner sc = new Scanner(System.in);

        int numero, quantidade;

        System.out.println("\n============= Descubra o Fatorial =============\n");

        System.out.print("\nDigite quantos números você quer fatorar: ");
        quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){

            System.out.print("\nDigite o número " + (i + 1) + ": ");
            numero = sc.nextInt();

            int fatorial = 1;

            for (int x = 1; x <= numero; x++){
                fatorial = fatorial * x;
            }

            System.out.println("\nO fatorial do número: " + numero + " é " + fatorial);
        }

    }
}
