import java.util.Scanner;

public class Exercicio36 {
    public static void main(String [] args){
        /*
        Faça um programa que leia 10 valores inteiros e positivos e:
        - Encontre o maior valor
        - Encontre o menor valor
        - Calcule a média dos números lidos
         */

        Scanner sc = new Scanner(System.in);

        int maior = 0, menor = 0, soma = 0, numero;
        double media;

        System.out.println("Digite 10 números inteiros e positivos:");

        System.out.print("Número 1: ");
        numero = sc.nextInt();

        while (numero < 0) {
            System.out.println("Valor inválido. Digite um número INTEIRO E POSITIVO: ");
            numero = sc.nextInt();
        }

        maior = numero;
        menor = numero;
        soma = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.printf("Número %d: ", i);
            numero = sc.nextInt();

            while (numero < 0) {
                System.out.println("Valor inválido. Digite um número INTEIRO E POSITIVO: ");
                numero = sc.nextInt();
            }

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        media = (double) soma / 10;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.printf("Média dos números: %.2f\n", media);

        sc.close();
    }
}