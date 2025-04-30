import java.util.Scanner;

public class Exercicio44 {
    public static void main(String [] args){
        /*
         Faça um programa que exiba as opções:
            1 – Conversão de Graus Celsius em Graus Fahrenheit
            2 – Conversão de Graus Fahrenheit em Graus Celsius
            3 – Peso ideal do homem
            4 – Peso ideal da mulher

            O programa só deve encerrar quando o usuário digitar ´S´ para a pergunta “Deseja encerrar o programa?” Obs.:
            Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
         */

        Scanner sc = new Scanner(System.in);

        int opc;
        String nome, continuar;
        double C, F, h, pesoIdeal, pesoAtual;

        System.out.println("=============== ESCOLHA ===============");

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        do{
            System.out.println("1 – Conversão de Graus Celsius em Graus Fahrenheit\n" +
                               "2 – Conversão de Graus Fahrenheit em Graus Celsius\n" +
                               "3 – Peso ideal do homem\n" +
                               "4 – Peso ideal da mulher");

            System.out.print("\nDigite a opção desejada: ");
            opc = sc.nextInt();

            if (opc >= 1 && opc <= 4){
                switch (opc){
                    case 1:
                        System.out.print("Digite a temperatura em grau Celsius: ");
                        C = sc.nextDouble();

                        F = (9 * C + 160) / 5;

                        System.out.printf("\n°%.2fC convertido em fahrenheit é %.2f°F", C, F);

                        break;

                    case 2:
                        System.out.print("Digite a temperatura em grau Fahrenheit: ");
                        F = sc.nextDouble();

                        C = (F - 32) * 5 / 9;

                        System.out.printf("\n°%.2fF convertido em celsius é %.2f°C", F, C);
                        break;

                    case 3:
                        System.out.print("Digite sua altura: ");
                        h = sc.nextDouble();

                        pesoIdeal = (72.7 * h) - 44.7;
                        System.out.printf("\nOlá Sr %s! Seu peso ideal é: %.2f kg", nome, pesoIdeal);

                        System.out.print("\nDigite seu peso atual (kg): ");
                        pesoAtual = sc.nextDouble();
                        sc.nextLine(); // Limpa o buffer

                        if (pesoAtual > pesoIdeal) {
                            System.out.println("\nVocê está acima do peso ideal.");
                        } else if (pesoAtual < pesoIdeal) {
                            System.out.println("\nVocê está abaixo do peso ideal.");
                        } else {
                            System.out.println("\nVocê está no peso ideal!");
                        }
                        break;

                    case 4:
                        System.out.print("Digite sua altura: ");
                        h = sc.nextDouble();

                        pesoIdeal = (62.1 * h) - 58;
                        System.out.printf("\nOlá Sra %s! Seu peso ideal é: %.2f kg", nome, pesoIdeal);

                        System.out.print("\nDigite seu peso atual (kg): ");
                        pesoAtual = sc.nextDouble();
                        sc.nextLine(); // Limpa o buffer

                        if (pesoAtual > pesoIdeal) {
                            System.out.println("Você está acima do peso ideal.");
                        } else if (pesoAtual < pesoIdeal) {
                            System.out.println("Você está abaixo do peso ideal.");
                        } else {
                            System.out.println("Você está no peso ideal!");
                        }
                        break;
                }
            } else {
                System.out.println("\nNúmero Inválido!");
            }

            System.out.print("Deseja encerrar o programa? (S para SAIR, QUALQUER COISA para NAO): ");
            continuar = sc.next().toUpperCase();
        } while (!continuar.equalsIgnoreCase("S"));

    }
}
