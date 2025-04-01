import java.util.Scanner;

public class Exercicio06 {
    public static void main(String [] args){
        /*
        Ler uma temperatura em Celsius e converter em Fahrenheit
        F = (9 * C + 160) / 5
        F representa Fahrenheit
        C representa Celsius
        */

        double F, C;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nConverter Grau Celsius em Fahrenheit \n");
        System.out.print("Digite a temperatura em grau Celsius: ");
        C = sc.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.printf("\n°%.2fC convertido em fahrenheit é %.2f°F", C, F);
    }
}
