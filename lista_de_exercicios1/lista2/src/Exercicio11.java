import java.util.Scanner;

public class Exercicio11 {
    public static void main(String [] args){
        /*
        Ler dois valores inteiros para as variáveis A e B,
        efetuar a troca dos valores de modo que a variável A passe a
        possuir o valor da variável B, e a variável B passe a possuir o valor da variável A.
        Apresentar os valores trocados.
         */
        Scanner sc = new Scanner(System.in);
        int a,b, aux = 0;

        System.out.println("\nTroca de Valores!");

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();

        System.out.println("O valor de A que era: " + a);
        System.out.println("O valor de B que era: " + b);

        aux = a;
        a = b;
        b = aux;

        System.out.println("Agora é \nA = " + a + "\nB = " + b);
    }
}
