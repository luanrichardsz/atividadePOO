import java.util.Scanner;

public class Exercicio22 {
    public static void main(String [] args){
        /*
        Faça um programa que leia um número. Se positivo armazene-o em A, se for negativo, em B.
        No final mostrar o resultado.
         */

        Scanner sc = new Scanner(System.in);
        int number, A, B;

        System.out.print("Digite um número: ");
        number = sc.nextInt();

        if (number > 0){
            A = number;
            System.out.println("Seu número: " + A);
        } else if (number < 0) {
            B = number;
            System.out.println("Seu número: " + B);
        } else {
            System.out.println("Seu número é 0");
        }
    }
}
