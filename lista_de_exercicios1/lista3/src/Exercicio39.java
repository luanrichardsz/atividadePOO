import java.util.Scanner;

public class Exercicio39 {
    public static void main(String [] args){
        /*
        Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
        e se é positivo ou negativo.
        O programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?" .
         */

        Scanner sc = new Scanner(System.in);

        int numero;
        String opc;

        System.out.println("\n==================== DESCUBRA ====================");

        do {
            System.out.print("\nDigite um número(podendo ser negativo): ");
            numero = sc.nextInt();

            if (numero > 0) {
                if (numero % 2 == 0) {
                    System.out.println("\nO número " + numero + " é positivo e par!");
                } else {
                    System.out.println("\nO número " + numero + " é positivo e impar!");
                }
            } else if (numero < 0) {
                if (numero % 2 == 0) {
                    System.out.println("\nO número " + numero + " é negativo e par!");
                } else {
                    System.out.println("\nO número " + numero + " é negativo e impar!");
                }
            } else {
                System.out.println("Você não digitou um número!");
            }

            System.out.print("\nDeseja continuar? Se sim, Digite 'S', se não, digite qualquer letra: ");
            opc = sc.next().trim().toUpperCase();

        } while (!opc.equalsIgnoreCase("S"));
    }
}
