import java.util.Scanner;

public class Exercicio24 {
    public static void main(String [] args){
        /*
        Escreva um programa que leia dois números inteiros e
        apresente as opções para usuário escolher o que deseja realizar:
        1 – Verificar se um dos números lidos é ou não múltiplo do outro
        2 – Verificar se os dois números lidos são pares
        3 – Verificar se a média dos dois números é maior ou igual a 7.
        4 – Sair
         */

        Scanner sc = new Scanner(System.in);
        int opc, number1, number2;

        do {
            System.out.print("Digite o primeiro número: ");
            number1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            number2 = sc.nextInt();

            System.out.println("1 - ");
        } while (opc != 0);

    }
}
