import java.util.Scanner;

public class Exercicio37 {
    public static void main(String [] args){
        /*
        Faça um programa de conversão de base numérica. O programa deverá apresentar uma tela de entrada com as
        seguintes opções:
            1 – Adição
            2 – Subtração
            3 – Multiplicação
            4 – Divisão
            Informe a opção:
         */
        Scanner sc = new Scanner(System.in);
        int opc;
        float number1, number2, resultado;
        String continuar;

        System.out.println("\n======================== Bem Vindo a Calcu ========================");

        do {
            System.out.print(
                            " 1 - Adição\n" +
                            " 2 - Subtração\n" +
                            " 3 - Multiplicação\n" +
                            " 4 - Divisão\n");

            System.out.print(" \nDigite a opção que você deseja: ");
            opc = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner após o nextInt()

            switch (opc) {
                case 1:
                    // Adição
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para somar: ");
                    number2 = sc.nextFloat();

                    resultado = number1 + number2;

                    System.out.println("\nResultado: " + number1 + " + " + number2 + " = " + resultado);
                    continuar = sc.nextLine().toUpperCase();
                    break;
                case 2:
                    // Subtração
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para subtração: ");
                    number2 = sc.nextFloat();

                    resultado = number1 - number2;

                    System.out.println("\nResultado: " + number1 + " - " + number2 + " = " + resultado);
                    continuar = sc.nextLine().toUpperCase();
                    break;
                case 3:
                    // Multiplicação
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para multiplicar: ");
                    number2 = sc.nextFloat();

                    resultado = number1 * number2;

                    System.out.println("\nResultado: " + number1 + " * " + number2 + " = " + resultado);
                    continuar = sc.nextLine().toUpperCase();
                    break;
                case 4:
                    // Divisão
                    System.out.print("\nDigite um número: ");
                    number1 = sc.nextFloat();

                    System.out.print("\nDigite outro número para dividir: ");
                    number2 = sc.nextFloat();

                    if (number2 != 0) {
                        resultado = number1 / number2;
                        System.out.println("\nResultado: " + number1 + " / " + number2 + " = " + resultado);
                    } else {
                        System.out.println("\nERROR: DIVISÃO POR ZERO! Tente novamente.");
                    }
                    continuar = sc.nextLine().toUpperCase();
                    break;
                default:
                    // Opção inválida
                    System.out.println("\nNúmero Inválido! Tente novamente.");
            }

            System.out.print("\nDeseja voltar ao menu principal? (S para SIM, qualquer outra letra para NÃO): ");
            continuar = sc.nextLine().toUpperCase();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Programa Encerrado");
        sc.close();
    }
}
