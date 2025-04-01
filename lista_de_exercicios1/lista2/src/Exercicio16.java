import java.util.Scanner;

public class Exercicio16 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do
        menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
         */

        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.println("\nQUAL O MAIOR? \n");

        System.out.print("Digite o primeiro numero: ");
        number1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println(number1 + " maior que " + number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " maior que " + number1);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
