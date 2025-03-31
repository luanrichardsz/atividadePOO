import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String [] args){
        /*
        Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
        comissão será de 5% do total da venda e que você tem os seguintes dados:
        - Identificação do vendedor
        - Código da peça
        - Preço unitário da peça
        - Quantidade vendida
         */

        int id, codigoDaPeca, quantidadeVendida;
        BigDecimal precoUnitario, valorComComissao, valorTotal;
        double percentual = 0.05;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPagamentos de Comissões \n");

        System.out.print("Funcionário, identifique-se com seu id: ");
        id = sc.nextInt();

        System.out.print("Digite o código da peça: ");
        codigoDaPeca = sc.nextInt();

        System.out.print("Digite o preço unitário: ");
        precoUnitario = sc.nextBigDecimal();

        System.out.print("Informe a quantidade vendida: ");
        quantidadeVendida = sc.nextInt();

        valorTotal = precoUnitario.multiply(BigDecimal.valueOf(quantidadeVendida));
        valorComComissao = valorTotal.multiply(BigDecimal.valueOf(percentual));

        System.out.println("\n=== Resumo da Venda ===");
        System.out.println("Funcionário ID: " + id);
        System.out.println("Código da peça: " + codigoDaPeca);
        System.out.println("Quantidade vendida: " + quantidadeVendida);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Valor total da venda: R$ " + valorTotal);
        System.out.println("Comissão (5%): R$ " + valorComComissao);
    }
}
