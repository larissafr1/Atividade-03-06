import java.util.Scanner;

public class Ex5 {
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
        public static int[] numerosPrimos(int[] vetor) {
        int countPrimos = 0;
        for (int num : vetor) {
            if (ehPrimo(num)) {
                countPrimos++;
            }
        }
        int[] primos = new int[countPrimos];
        int index = 0;
        for (int num : vetor) {
            if (ehPrimo(num)) {
                primos[index] = num;
                index++;
            }
        }
        return primos;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoVetor = 15;
        int[] vetor = new int[tamanhoVetor];
      
        System.out.println("Digite os números inteiros do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }
        int[] primos = numerosPrimos(vetor);
        System.out.println("Números primos encontrados no vetor:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
        
        scanner.close();
    }
}