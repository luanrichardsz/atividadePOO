import java.util.Scanner;

public class Exercicio38 {
    public static void main(String [] args){
        /*
        Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
        E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
        Quando o número de horas exceder a 50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável.
        A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
        O programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
         */

        // C = Codigo;
        // N = Numeros de Horas Trabalhadas se exceder a 50, calcule o excesso de pagamento armazenando-o
        // E = Excesso de Pagamento = 20,00

        Scanner sc = new Scanner(System.in);
        int C, N;
        double salarioTotal, E = 0;
        String continuar;

        do {
            System.out.println("\n=============== CALCULO DE SALARIO ===============");

            System.out.print("Digite o código do operário: ");
            C = sc.nextInt();
            System.out.print("Digite o número de horas trabalhadas: ");
            N = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            if (N > 50) {
                int horasExcedentes = N - 50;
                E = horasExcedentes * 20.0;
                salarioTotal = 50 * 10.0 + E;
            } else {
                salarioTotal = N * 10.0;
                E = 0; // Zerar o excedente se não ultrapassar 50 horas
            }

            System.out.printf("\nCódigo do operário: %d", C);
            System.out.printf("\nSalário total: R$ %.2f", salarioTotal);
            System.out.printf("\nSalário excedente: R$ %.2f", E);

            System.out.print("\n\nDeseja encerrar o programa? (S para sair, qualquer outra tecla para continuar): ");
            continuar = sc.nextLine().toUpperCase();

        } while (!continuar.equals("S"));
    }
}