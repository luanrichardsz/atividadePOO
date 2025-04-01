import java.util.Scanner;

public class Exercicio13 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
         */
        int number1, number2, number3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        number1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        number3 = sc.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            //number1 é maior que todos
            if (number2 >= number3) {
                //number2 é o do meio e o 3 é o menor
                System.out.println(number1 + ", " + number2 + ", " + number3);
            } else {
                //number3 é o do meio e o 2 é o menor
                System.out.println(number1 + ", " + number3 + ", " + number2);
            }
        } else if (number2 >= number1 && number2 >= number3) {
            //number2 é maior que todos
            if (number1 >= number3) {
                //number1 é o do meio e o 3 é o menor
                System.out.println(number2 + ", " + number1 + ", " + number3);
            } else {
                //number3 é o do meio e o 1 é o menor
                System.out.println(number2 + ", " + number3 + ", " + number1);
            }
        } else if (number3 >= number2 && number3 >= number1) {
            //number3 é maior que todos
            if (number2 >= number1) {
                //number2 é o do meio e o 1 é o menor
                System.out.println(number3 + ", " + number2 + ", " + number1);
            } else {
                //number1 é o do meio e o 2 é o menor
                System.out.println(number3 + ", " + number1 + ", " + number2);
            }
        }
    }
}