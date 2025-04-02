import java.util.Scanner;

public class Exercicio20 {
    public static void main(String [] args){
        /*
        Escrever um programa declarando três variáveis do tipo inteiro (a, b e c).
        Ler um valor maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente).

        Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.
         */

        Scanner sc = new Scanner(System.in);
        int A, B, C, maior, menor, menorMultiplicado;
        double maiorDividido;

        do {
            System.out.print("Digite o valor de A: ");
            A = sc.nextInt();
        } while( A <= 0);

        do {
            System.out.print("Digite o valor de B: ");
            B = sc.nextInt();
        } while ( B <= 0);

        do {
            System.out.print("Digite o valor de C: ");
            C = sc.nextInt();
        } while ( C <= 0);

        if(A > B && A > C){
            //A é maior que todos
            maior = A;
            if (B > C){
                //A é maior e C é menor
                menor = C;
            } else {
                //A é maior e B é menor
                menor = B;
            }
        } else if(B > A && B > C) {
            //B É MAIOR QUE TODOS
            maior = B;
            if(A > C){
                //B é maior e C é menor
                menor = C;
            } else {
                //B é maior e A é menor
                menor = A;
            }
        } else {
            //C é maior
            maior = C;
            if (A > B){
                //C é maior e B é menor
                menor = B;
            } else {
                //C é maior e A é menor
                menor = A;
            }
        }

        // Calculos
        menorMultiplicado = menor * maior;
        maiorDividido = maior / menor;

        //Saidas
        System.out.println("\n============================== Resultados ==============================\n");
        System.out.println("\nValores: \nA = " + A + "\nB = " + B + "\nC = " + C);
        System.out.println("\nMaior Valor = " + maior + "\n" + "\nMenor Valor = " + menor);
        System.out.println("\nMenor * Maior = " + menorMultiplicado);
        System.out.println("\nMaior / Menor = " + maiorDividido);
    }
}
