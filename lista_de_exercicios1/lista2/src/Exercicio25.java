import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal,
        utilizando as seguintes fórmulas: (h = altura)
        - Para homens: (72.7 * h) - 58
        - Para mulheres: (62.1 * h) - 44.7
        */
        
        Scanner sc = new Scanner(System.in);
        
        String nome, sexo;
        double h, pesoIdeal;
        
        System.out.println("\n============= Calcule seu Peso Ideal =============\n");
        
        System.out.print("Primeiro, Digite seu nome: ");
        nome = sc.nextLine();
        
        System.out.print("Digite seu sexo(M para Mulher e H para Homem): ");
        sexo = sc.next().trim();
        
        System.out.print("Digite sua altura: ");
        h = sc.nextDouble();
        
        if (sexo.equalsIgnoreCase("F")){
            
            pesoIdeal = (62.1 * h) - 58;
            System.out.println(pesoIdeal);
            
        } else if(sexo.equalsIgnoreCase("M")) {
            
            pesoIdeal = (72.7 * h) - 44.7;
            System.out.println(pesoIdeal);
            
        } else {
            System.out.println("Digite o sexo valido");
        }
    }
}
