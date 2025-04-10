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


            System.out.println("\n1 - Verificar se os números são multiplos\n" +
                    "2 - Verificar se os números são pares\n" +
                    "3 - Verificar se a média dos dois números é maior ou igual a 7\n" +
                    "4 - Sair\n");

            System.out.print("Diante as opções, digite a opção desejada: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    //verificar se são multiplos
                    break;
                case 2:
                    if (number1 % 2 == 0){
                        if (number2 % 2 == 0){
                            System.out.println("\nOs dois são pares!\n");
                        } else {
                            System.out.println("\n" + number1 + " é par, mas " + number2 + " é impar!\n");
                        }
                    } else if (number2 % 2 == 0) {
                        System.out.println("\n" + number2 + " é par mas, " + number1 + " é impar!\n");
                    } else {
                        System.out.println("\nOs dois são impares!\n");
                    }
            }
            break;

            case 3:
                break;

            case 4:
                System.out.println("Saindo do programa.....");
                break;

            default:
                System.out.println("\nNúmero Invalido!\n");
                break;
        }

    } while (opc != 4);

}
}
