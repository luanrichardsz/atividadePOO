import java.util.Scanner;

public class Exercicio14 {
    public static void main(String [] args){
        /*
         Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
         */

        Scanner sc = new Scanner(System.in);

        int number1, number2, diferenca;

        System.out.println("\nQUAL A DIFERENÇA?\n");

        System.out.print("Digite o primeiro numero: ");
        number1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println("\nO numero " + number1 + " é maior que o numero " + number2);

            diferenca = number1 - number2;
            System.out.println("\nA diferença do maior pro menor é: " + diferenca);
        } else if (number2 > number1){
            System.out.println("\nO numero " + number2 + " é maior que numero " + number1);

            diferenca = number2 - number1;
            System.out.println("\nA diferença do maior pro menor é: " + diferenca);
        } else {
            System.out.println("\nOs numeros sao iguais");
        }
    }
}
