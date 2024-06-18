import java.util.Scanner;

public class Ex8 {
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1;
        } else if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        long resultado = calcularFatorial(numero);
        
        if(resultado == -1) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }
        
        scanner.close();
    }
}