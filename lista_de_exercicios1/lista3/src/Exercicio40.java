import java.util.Scanner;

public class Exercicio40 {
    public static void main(String [] args){
        /*
        A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são altamente
        poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
        indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do
        1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
        notificados a paralisarem suas atividades.

        Faça um programa que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
        O algoritmo só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
         */

        // INDICE DE POPULACAO ACEITAVEL VARIA DE 0,05 ate 0,25
        // SE O INDICE SUBIR PARA 0,3 AS INDUSTRIAS DO PRIMEIRO GRUPO SUSPENDEREM A SUAS ATIVIDADES
        // SE O INDICE SUBIR PARA 0,4 AS INDUSTRIAS DO PRIMEIRO E SEGUNDO GRUPO SUSPENDEREM A SUAS ATIVIDADES
        // SE O INDICE SUBIR PARA 0,5 TODAS AS INDUSTRIAS SUSPENDEREM A SUAS ATIVIDADES

        Scanner sc = new Scanner(System.in);
        String continuar;
        double indice;

        do {
            System.out.print("\nDigite o índice de poluição medido: ");
            indice = sc.nextDouble();

            if(indice >= 0.05 && indice <= 0.25){
                System.out.println("\nIndice de poluição aceitavel!");
            } else if (indice >= 0.3 && indice <= 0.4) {
                System.out.println("\nIndustrias do 1º grupo DEVEM suspender as atividades");
            } else if (indice >= 0.4 && indice <= 0.5) {
                System.out.println("\nIndustrias do 1º e 2º grupo DEVEM suspender as atividades");
            } else if (indice >= 0.5) {
                System.out.println("\nIndustrias do 1º, 2º e 3º grupo DEVEM suspender as atividades");
            } else {
                System.out.println("\nIndice de poluição abaixo do minino. Verificar medição!");
            }

            System.out.print("\nDeseja encerrar o programa? (S para SIM, qualquer outra letra para NÃO): ");
            continuar = sc.next().trim().toUpperCase();

        } while (!continuar.equalsIgnoreCase("S"));

        System.out.println("\nPrograma Encerrado!");
    }
}
