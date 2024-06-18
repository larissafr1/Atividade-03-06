import java.util.Scanner;

public class Ex10 {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();
        
        boolean resultado = ehPrimo(numero);
        
        if (resultado) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
        
        scanner.close();
    }
}