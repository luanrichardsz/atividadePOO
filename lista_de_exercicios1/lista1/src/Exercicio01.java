import java.util.Scanner;

public class Exercicio01 {
    public static void main(String [] args){

        double estoqueMedio;
        int qntdMinima, qntdMaxima;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade maxima de peças: ");
        qntdMaxima = sc.nextInt();

        System.out.print("Qual a quantidade minima de peças: ");
        qntdMinima = sc.nextInt();

        estoqueMedio = (qntdMinima + qntdMaxima) / 2;

        System.out.println("O estoque medio de peças: " + estoqueMedio);
    }
}
