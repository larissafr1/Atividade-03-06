import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_VENDEDORES=10;

        String[]nomes=new String[NUM_VENDEDORES];
        double[]vendas=new double[NUM_VENDEDORES];
        double[]comissoes=new double[NUM_VENDEDORES];
        double[]valoresAReceber=new double[NUM_VENDEDORES];

        for (int i = 0; i < NUM_VENDEDORES; i++) {
            System.out.print("Nome do vendedor "+(i+1)+": ");
            nomes[i] = sc.nextLine();
            System.out.print("total de vendas do vendedor " + nomes[i] + ": ");
            vendas[i] = sc.nextDouble();
            System.out.print("percentual de comissão do vendedor " + nomes[i] + " (em %): ");
            comissoes[i] = sc.nextDouble() / 100;
            sc.nextLine(); 
            valoresAReceber[i] = vendas[i] * comissoes[i];
        }
        System.out.println("\nRelatório de valores a receber:");
        double totalVendas = 0;
        double maiorValor = valoresAReceber[0];
        String vendedorMaiorValor = nomes[0];
        double menorValor = valoresAReceber[0];
        String vendedorMenorValor = nomes[0];

        for (int i = 0; i < NUM_VENDEDORES; i++) {
            System.out.println("Vendedor: " + nomes[i] + " - Valor a receber: R$ " + valoresAReceber[i]);
            totalVendas += vendas[i];

            if (valoresAReceber[i] > maiorValor) {
                maiorValor = valoresAReceber[i];
                vendedorMaiorValor = nomes[i];
            }
            if (valoresAReceber[i] < menorValor) {
                menorValor = valoresAReceber[i];
                vendedorMenorValor = nomes[i];
            }
        }
        System.out.println("\nTotal das vendas de todos os vendedores: R$ " + totalVendas);
        System.out.println("Maior valor a receber: R$ " + maiorValor + " - Vendedor: " + vendedorMaiorValor);
        System.out.println("Menor valor a receber: R$ " + menorValor + " - Vendedor: " + vendedorMenorValor);
        sc.close();
    }
}