import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        /*
        Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
        utilizando as seguintes fórmulas: (h = altura)
        - Para homens: (72.7 * h) - 58
        - Para mulheres: (62.1 * h) - 44.7
        */

        Scanner sc = new Scanner(System.in);

        String nome, sexo;
        double h, pesoIdeal;

        System.out.println("\n============= Calcule seu Peso Ideal =============\n");

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua altura: ");
        h = sc.nextDouble();

        System.out.print("Digite seu sexo (M para Mulher e H para Homem): ");
        // a função trim para tirar qualquer espaço da variavel
        sexo = sc.next().trim();

        // a função equalsIgnoreCase para ignorar se for maiuscula ou minuscula
        if (sexo.equalsIgnoreCase("M")) {

            pesoIdeal = (62.1 * h) - 58;
            System.out.printf("\nOlá Sra.%s! Depois de calcularmos, seu peso ideal é: %.2f kg", nome, pesoIdeal);

        } else if(sexo.equalsIgnoreCase("H")) {

            pesoIdeal = (72.7 * h) - 44.7;
            System.out.printf("\nOlá Sr.%s! Depois de calcularmos, seu peso ideal é: %.2f kg", nome, pesoIdeal);

        } else {
            System.out.println("Digite o sexo valido");
        }
    }
}