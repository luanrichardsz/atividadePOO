import java.util.Scanner;

public class Exercicio34 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior.
        Suporemos que o número de elementos deste conjunto não é conhecido,
        e que um número negativo será utilizado para sinalizar o fim dos dados
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero positivo (numero negativo para encerrar): ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Nenhum numero positivo foi inserido.");
            return;
        }

        int maior = numero;
        int menor = numero;

        while (true) {
            System.out.println("Digite o proximo numero positivo (ou numero negativo para encerrar): ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Menor numero: " + menor);
        System.out.println("Maior número: " + maior);

    }
}