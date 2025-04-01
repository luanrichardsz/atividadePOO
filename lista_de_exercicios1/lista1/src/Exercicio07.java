import java.util.Scanner;

public class Exercicio07 {
    public static void main(String [] args){
        /*
        Ler uma temperatura em Fahrenheit e converter em Celsius
        C = (F - 32) * 5 / 9
        F representa Fahrenheit
        C representa Celsius
        */

        double F, C;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nConverter Grau Fahrenheit em Celsius \n");
        System.out.print("Digite a temperatura em grau Fahrenheit: ");
        F = sc.nextDouble();

        C = (F - 32) * 5 / 9;

        System.out.printf("\n°%.2fF convertido em celsius é %.2f°C", F, C);
    }
}
