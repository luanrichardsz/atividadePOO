import java.util.Scanner;

public class Exercicio18 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia um número inteiro (variável CODIGO).
        Verificar se o código é igual a 1, igual a 2 ou igual a 3.
        Caso não seja, apresentar a mensagem “Código inválido”.
        Ao ser verificado o código e constatado que é um valor válido,
        o programa deve verificar cada código em separado para determinar seu valor por extenso, ou seja,
        apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
         */

        Scanner sc = new Scanner(System.in);

        int codigo;

        do{
            System.out.print("\nDigite um numero: ");
            codigo = sc.nextInt();

            switch (codigo){
                case 1:
                    System.out.println("\nUm");
                    break;
                case 2:
                    System.out.println("\nDois");
                    break;
                case 3:
                    System.out.println("\nTrês");
                    break;
                default:
                    System.out.println("\nValor Inválido!");
                    break;
            }

        } while (codigo != 1 && codigo != 2 && codigo != 3);
    }
}
