import java.util.Scanner;

public class Exercicio33 {
    public static void main(String [] args){
        /*
        Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova.
        O número de alunos é desconhecido.
        Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.
         */

        Scanner sc = new Scanner(System.in);

        int numberMatricula, totalAlunos = 0;
        double nota, notaMedia, somaNota = 0;

        do {
            System.out.print("\nDigite o número da matricula (ou 0 para sair): ");
            numberMatricula = sc.nextInt();

            if (numberMatricula <= 0){
                System.out.println("\nSaindo.....");
                break;
            }

            System.out.print("\nDigite a nota do aluno(a): ");
            nota = sc.nextDouble();

            somaNota = nota + nota;

            totalAlunos += 1;

        } while (true);

        notaMedia = somaNota / totalAlunos;

        System.out.println("Resultado:");
        System.out.printf("\nO total de alunos: %d", totalAlunos);
        System.out.printf("\nO nota total dos alunos: %.2f", somaNota);
        System.out.printf("\nA nota media dos alunos: %.2f", notaMedia);
    }
}
