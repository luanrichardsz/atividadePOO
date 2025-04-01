import java.util.Scanner;

public class Exercicio15 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia quatro notas escolares de um aluno e
        apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar for maior ou igual a 7.
        Se o valor da média for menor que 7, solicitar a nota do recuperação, somar com o valor da média e obter a nova média.
        Se a nova média for maior ou igual a 7, apresentar uma mensagem informando que o aluno foi aprovado na recuperação.
        Se o aluno não foi aprovado, apresentar uma mensagem informando esta condição.
        Apresentar junto com as mensagens o valor da média do aluno.
         */
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media, notaRecup, novaMedia;

        System.out.println("\nVocê passou na media? \n");

        System.out.print("Digite sua primeira nota: ");
        nota1 = sc.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        nota2 = sc.nextFloat();

        System.out.print("Digite sua terceira nota: ");
        nota3 = sc.nextFloat();

        System.out.print("Digite sua quarta nota: ");
        nota4 = sc.nextFloat();

        if (nota1 < 0 || nota1 > 10){
            System.out.println("Nota 1 Invalida!");
        } else if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota 2 Invalida!");
        } else if (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota 3 Invalida!");
        } else if (nota4 < 0 || nota4 > 10) {
            System.out.println("Nota 4 Invalida!");
        } else {
            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("\nSua media ficou: " + media);

            if(media >= 7){
                System.out.println("\nParabens, você foi aprovado!");
            } else {
                System.out.print("\nVocê ficou de recuperação \nDigite sua nota de recuperação: ");
                notaRecup = sc.nextFloat();

                if (notaRecup < 0 || notaRecup > 10){
                    System.out.println("Nota invalida!");
                } else {
                    novaMedia = (media + notaRecup) / 2;
                    if (novaMedia >= 7) {
                        System.out.println("\nSua nova media ficou: " + novaMedia);
                        System.out.println("Parabens, nos 45 no segundo tempo, você foi aprovado na recuperação!");
                    } else {
                        System.out.println("\nSua nova media ficou: " + novaMedia);
                        System.out.println("\nInfelizmente, você foi reprovado na recuperação!");
                    }
                }
            }
        }


    }
}
