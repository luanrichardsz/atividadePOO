import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio43 {
    public static void main(String [] args){
        /*
        Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de
        alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro
        de xadrez, de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros subseqüentes, o dobro
        do quadro anterior. A rainha achou o trabalho barato e pediu que o serviço fosse executado, sem se dar conta de
        que seria impossível efetuar o pagamento.

        Faça um programa para calcular o número de grãos que o monge esperava receber.
         */

        // PAGAMENTO = GRAO DE TRIGO DISPOSTOS EM UM TABULEIRO DE XADREZ
        // O PRIMEIRO QUADRO DEVERIA CONTER APENAS UM GRAO E O SUBSEQUENTE O DOBRO DO QUADRO ANTERIOR

        Scanner sc = new Scanner(System.in);
        BigInteger grao = BigInteger.ONE; // Grãos na casa atual (começa com 1)
        BigInteger total = BigInteger.ZERO; // Total acumulado
        int quadradosNoTabuleiro = 64;

        System.out.println("Calculo de Grãos em um Tabuleiro de Xadrez:");

        for (int i = 1; i <= quadradosNoTabuleiro; i++) {
            total = total.add(grao);
            grao = grao.multiply(BigInteger.TWO);
        }

        System.out.println("\nTotal de grãos que o monge esperava receber: " + total);
    }
}
