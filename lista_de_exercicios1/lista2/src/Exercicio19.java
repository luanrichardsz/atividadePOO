import java.util.Scanner;

public class Exercicio19 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C).
        Verificar se cada lado é menor que a soma dos outros dois lados. Se sim, saber de A==B e se B==C,
        sendo verdade o triângulo é eqüilátero;
        Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o
        triângulo será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
         */

        Scanner sc = new Scanner(System.in);
        float A, B, C;

        System.out.println("\nDescubra o triângulo \n");

        System.out.print("Digite o valor de um lado: ");
        A = sc.nextFloat();

        System.out.print("Digite o valor do outro lado: ");
        B = sc.nextFloat();

        System.out.print("Digite o valor do outro lado: ");
        C = sc.nextFloat();

        //cada lado deve ser menor que a soma dos outros dois.
        if(A < B + C && B < A + C && C < A + B){
            if(A == B && A == C){
                System.out.println("\nO triângulo é equilatero!");
            } else if(A == B || A == C || B == C){
                System.out.println("\nO triângulo é isósceles!");
            } else {
                System.out.println("\nO triângulo é escaleno!");
            }
        } else {
            System.out.println("\nOs lados fornecidos não caracterizam um triângulo.");
        }
    }
}
