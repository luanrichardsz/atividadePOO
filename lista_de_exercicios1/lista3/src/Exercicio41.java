import java.util.Scanner;

public class Exercicio41 {
    public static void main(String [] args){
        /*
        Faça um programa que dada a idade de um nadador, classifique-o em uma das seguintes categorias:
        - Infantil A = 5 a 7 anos
        - Infantil B = 8 a 11 anos
        - Juvenil A = 12 a 13 anos
        - Juvenil B = 14 a 17 anos
        - Adultos = Maiores de 18 anos
         */

        Scanner sc = new Scanner(System.in);

        int idadeNadador, opc;

        System.out.println("\n================= Classificação Nadador =================\n");

        do {
            System.out.print("\nDigite a idade do nadador: ");
            idadeNadador = sc.nextInt();

            if (idadeNadador >= 5 && idadeNadador <= 7){
                System.out.println("\nEsse nadador esta classificado em Infantil A!");
            } else if (idadeNadador >= 8 && idadeNadador <= 11) {
                System.out.println("\nEsse nadador esta classificado em Infantil B!");
            } else if (idadeNadador >= 12 && idadeNadador <= 13){
                System.out.println("\nEsse nadador esta classificado em Juvenil A!");
            } else if (idadeNadador >= 14 && idadeNadador <= 17){
                System.out.println("\nEsse nadador esta classificado em Juvenil B!");
            } else if (idadeNadador >= 18) {
                System.out.println("\nEsse nadador esta classificado em Adulto!");
            } else {
                System.out.println("\nEsse nadador não tem classificação!");
            }

            System.out.print("\nDIGITE 0 PARA SAIR ou QUALQUER NUMERO PARA CONTINUAR: ");
            opc = sc.nextInt();

            if (opc == 0){
                System.out.println("Saindo.....");
            }

        } while (opc != 0);
    }
}