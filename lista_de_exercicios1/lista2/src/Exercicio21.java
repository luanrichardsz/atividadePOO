import java.util.Scanner;

public class Exercicio21 {
    public static void main(String [] args){
        /*
        Faça um programa que leia um número inteiro
        mostre uma mensagem na tela indicando se este número é positivo ou negativo.
        Pare a execução do programa quando o usuário requisitar.
         */

        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nDigite um número (0 para sair do programa): ");
            number = sc.nextInt();

            if(number > 0){
                System.out.println("O número: " + number + " é POSITIVO!");
            } else if (number < 0) {
                System.out.println("O número: " + number + " é NEGATIVO!");
            } else {
                System.out.println("\nVocê digitou 0. \nSAINDO......");
            }
        } while (number != 0);
    }
}
