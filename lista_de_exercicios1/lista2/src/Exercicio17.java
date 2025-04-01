import java.util.Scanner;

public class Exercicio17 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia um número inteiro.
        Verificar por meio de condição se o valor fornecido está na faixa entre 0 (zero) e 9 (nove).
        Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
        Caso contrário, apresentar a mensagem “valor inválido”.
         */

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("\nDigite um valor: ");
        number = sc.nextInt();

        if (number >= 0 && number <= 9){
            System.out.println("\nValor Válido");
        } else {
            System.out.println("\nValor Inválido");
        }
    }
}
