import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numeroProduto = 5;
        String[] nomes = new String[numeroProduto];
        double[] valores = new double[numeroProduto];
        for (int i = 0; i < numeroProduto; i++) {
            System.out.println("Nome do produto "+(i + 1)+ ": ");
            nomes[i] = sc.nextLine();
            System.out.println("Preço do produto "+nomes[i]+ ": ");
            valores[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        int quantMenor50 = 0;
        double somaPrecosMaior100 = 0;
        int quantMaior100 = 0;
        System.out.println("\nProdutos com valor entre 50 reais e 100 reais:");
        for (int i = 0; i < numeroProduto; i++) {
            if (valores[i] < 50.00) {
                quantMenor50++;
            } else if (valores[i] >= 50.00 && valores[i] <= 100.00) {
                System.out.println(nomes[i]);
            } else if (valores[i] > 100.00) {
                somaPrecosMaior100 += valores[i];
                quantMaior100++;
            }
        }
        System.out.println("\nprodutos com preço inferior a R$ 50,00: " + quantMenor50);
       
        if (quantMaior100 > 0) {
            double mediaPrecosMaior100 = somaPrecosMaior100 / quantMaior100;
            System.out.println("Média dos preços dos produtos com preço superior a R$ 100,00: R$ " + mediaPrecosMaior100);
        } else {
            System.out.println("Não há produtos com preço superior a R$ 100,00.");
        }
        sc.close(); 
    }
}