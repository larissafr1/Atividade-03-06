public class Ex6 {
    public static int somaAteN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
    public static void main(String[] args) {
        int numero = 5; 
        int resultado = somaAteN(numero);
        System.out.println("A soma do número 1 até o " + numero + " é: " + resultado);
    }
}