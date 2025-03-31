import java.util.Scanner;

public class Exercicio12 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia um número inteiro e exiba o seu módulo.
        O módulo de um número x é: x se x é maior
        ou igual a zero
        x * (-1) se x é menor que zero
         */

        Scanner sc = new Scanner(System.in);

        int X;

        System.out.print("\nDigite o valor de X: ");
        X = sc.nextInt();

        if(X >= 0){
            System.out.println("X é maior que 0!");
        } else {
            System.out.println("X é menor que zero!");
        }
    }
}
