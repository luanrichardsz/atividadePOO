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
        float number1, number2, resultado;

        System.out.println("\n======================== Bem Vindo a Calcu ========================");

        do{
            System.out.print(" 1 - Adição\n" +
                    " 2 - Subtração\n" +
                    " 3 - Multiplicação\n" +
                    " 4 - Divisão\n" +
                    " 0 - Sair\n" );

            System.out.print(" \nDigite a opção que você deseja: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    //adição
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para somar: ");
                    number2 = sc.nextFloat();

                    resultado = number1 + number2;

                    System.out.println("\nResultado: " + number1 + " + " + number2 + " = " + resultado);
                    break;
                case 2:
                    //subtração
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para subtração: ");
                    number2 = sc.nextFloat();

                    resultado = number1 - number2;

                    System.out.println("\nResultado: " + number1 + " - " + number2 + " = " + resultado);
                    break;
                case 3:
                    //multipli
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para multiplicar: ");
                    number2 = sc.nextFloat();

                    resultado = number1 * number2;

                    System.out.println("\nResultado: " + number1 + " * " + number2 + " = " + resultado);
                    break;
                case 4:
                    //divisao
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para dividir: ");
                    number2 = sc.nextFloat();

                    if(number2 != 0) {
                        resultado = number1 / number2;

                        System.out.println("\nResultado: " + number1 + " / " + number2 + " = " + resultado);
                    } else {
                        System.out.println("\nERROR: DIVISÃO POR ZERO! Tente novamente.");
                    }
                    break;
                case 0:
                    //sair
                    System.out.println("\nSaindo do Calcu........");
                    break;
                default:
                    //invalido
                    System.out.println("\nNúmero Invalido! Tente novamente.");
            }
        } while (opc != 0);
    }
}
