import java.util.Scanner;

public class Exercicio30 {
    public static void main(String [] args){
        /*
        Faça um programa para imprimir uma tabuada.
        */
        Scanner sc = new Scanner(System.in);

        int numero, numeroMultiplicado;

        System.out.println("\n====================== TABUADA ======================\n");

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        System.out.printf("\nTabuada de %d:\n", numero);

        for (int i = 1; i <= 10; i++){
            numeroMultiplicado = numero * i;

            System.out.printf("%d * %d = %d\n", numero, i, numeroMultiplicado );
        }
    }
}
