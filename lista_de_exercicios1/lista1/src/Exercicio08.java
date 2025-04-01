import java.util.Scanner;

public class Exercicio08 {
    public static void main(String [] args){
        /*
        Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
        V = 3.14159 * R * R * A
        Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
        */

        Scanner sc = new Scanner(System.in);
        double V,R,A;

        System.out.println("\nCalculando o valor do volume de uma lata de óleo! \n");

        System.out.print("Digite o valor do raio(em metros): ");
        R = sc.nextDouble();

        System.out.print("Digite o valor da altura(em metros): ");
        A = sc.nextDouble();

        V = 3.14159 * R * R * A;

        System.out.printf("\nO volume da lata de óleo: %.2f", V);
    }
}
