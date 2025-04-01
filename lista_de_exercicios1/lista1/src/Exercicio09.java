import java.util.Scanner;

public class Exercicio09 {
    public static void main(String [] args){
        /*
        Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa
        expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
         */

        Scanner sc = new Scanner(System.in);

        int ano,meses,dias;
        int anoEmDias, mesesEmDia;
        int diasSomados;

        System.out.println("\nDescubra sua idade em dias! \n");
        System.out.println("Digite sua idade: ");
        System.out.print("Em anos: ");
        ano = sc.nextInt();

        System.out.print("Em meses: ");
        meses = sc.nextInt();

        System.out.print("Em dias: ");
        dias = sc.nextInt();

        anoEmDias = ano * 365;
        mesesEmDia = meses * 30;

        diasSomados = anoEmDias + mesesEmDia + dias;

        System.out.println("Sua idade em dias é: " + diasSomados + " dias.");
    }
}
    