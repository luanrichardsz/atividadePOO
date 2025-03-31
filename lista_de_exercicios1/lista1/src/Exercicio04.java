import java.util.Scanner;

public class Exercicio04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C,D;

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();

        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();

        System.out.println("\n=== Resultados das Adições ===");
        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));

        System.out.println("\n=== Resultados das Multiplicações ===");
        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));
    }
}
