import java.util.Scanner;

public class Exercicio42 {
    public static void main(String [] args){
        /*
        Faça um programa que determine o maior e o menor entre N números lidos.
        A condição de parada é a entrada de um valor 0, ou seja,
        programa deve ficar executando até que a entrada seja igual a 0 (ZERO).
        */

        Scanner sc = new Scanner(System.in);

        Integer maior = null, menor = null;
        int numero;

        System.out.println("================= MAIOR E MENOR =================");

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (maior == null || numero > maior) {  // Se for o primeiro número ou maior que o atual
                    maior = numero;
                }
                if (menor == null || numero < menor) {  // Se for o primeiro número ou menor que o atual
                    menor = numero;
                }
            }
        } while (numero != 0);

        System.out.println("\nFinalizando o Programa: ");
        if (maior != null) {
            System.out.println("O maior número: " + maior);
            System.out.println("O menor número: " + menor);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }
}
