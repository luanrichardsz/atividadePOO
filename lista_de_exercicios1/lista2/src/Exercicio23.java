import java.util.Scanner;

public class Exercicio23 {
    public static void main(String [] args){
        /*
        Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
        1 – Adição
        2 – Subtração
        3 – Multiplicação
        4 – Divisão
         */

        Scanner sc = new Scanner(System.in);
        int opc;
        float number1, number2;

        System.out.println("\n======================== Bem Vindo a Calcu ========================");
        System.out.print(" 1 - Adição\n" +
                         " 2 - Subtração\n" +
                         " 3 - Multiplicação\n" +
                         " 4 - Divisão\n" +
                         " 0 - Sair\n" );

        System.out.print(" \nDigite a opção que você deseja: ");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                //adição
            case 2:
                //subtração
            case 3:
                //multipli
            case 4:
                //divisao
            case 0:
                //sair
            default:
                //invalido
        }
    }
}
