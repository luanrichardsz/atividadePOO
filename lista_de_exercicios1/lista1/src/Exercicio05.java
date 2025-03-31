import java.util.Scanner;

public class Exercicio05 {
    public static void main(String [] args){
        // 12Km = 1L
        // usuario fornecer o tempo gasto na viagem E a velocidade media
        // DISTANCIA = TEMPO * VELOCIDADE
        // LITROS_USADOS = DISTANCIA / 12

        Scanner sc = new Scanner(System.in);
        int horas, minutos, velocidadeMedia;
        double tempoGastoHoras, distancia, litrosUsados;

        System.out.println("\nDescubra a quantidade de litros de combustivel você gastou na sua viagem!\n");

        System.out.println("Digite o tempo que você gastou nessa viagem: ");
        System.out.print("Horas: ");
        horas = sc.nextInt();
        System.out.print("Minutos: ");
        minutos = sc.nextInt();

        System.out.print("Digite a velocidade média que você teve na viagem: ");
        velocidadeMedia = sc.nextInt();

        tempoGastoHoras = horas + (minutos / 60.0);

        distancia = tempoGastoHoras * velocidadeMedia;

        litrosUsados = distancia / 12;

        System.out.println("\n=== As Informações da sua Viagem ===");
        System.out.println("A Velocidade Média: " + velocidadeMedia + "km/h");
        System.out.println("Tempo Gasto: " + horas + " horas e " + minutos + " minutos!");
        System.out.printf("A Distancia Percorrida: %.2f km", distancia);
        System.out.printf("\nA Quantidade de Litros Usado foi: %.2fL!", litrosUsados);
    }
}
