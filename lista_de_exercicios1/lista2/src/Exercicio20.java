import java.util.Scanner;

public class Exercicio20 {
    public static void main(String [] args){
        /*
        Escrever um programa declarando três variáveis do tipo inteiro (a, b e c).
        Ler um valor maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente).
        Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.
         */

        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();

        if(A > 0 && B > 0 && C > 0){
            if (A > B && A > C){

            }
        } else {
            System.out.println("Valor inválido! Tente novamente.");
        }

    }
}
