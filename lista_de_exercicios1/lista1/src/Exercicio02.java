import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String [] args){
        /*
        Faça um programa que:
        - Leia a cotação do dólar
        - Leia um valor em dólares
        - Converta esse valor para Real
        - Mostre o resultado
         */

        // melhor que o double e float pos controla o arredondamento
        BigDecimal cotacaoDolar = new BigDecimal(0);
        BigDecimal valorEmDolar = new BigDecimal(0);

        Scanner sc = new Scanner(System.in);

        System.out.println("\nConverter Dolar Para Real \n");

        System.out.print("Digite a cotação do dolar hoje: ");
        cotacaoDolar = sc.nextBigDecimal();

        System.out.print("Digite o valor em Dolares para Real: ");
        valorEmDolar = sc.nextBigDecimal();
    }
}
