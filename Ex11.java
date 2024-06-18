public class Ex11 {
    public static double calcularS(int N) {
        double soma = 0.0;
        double fatorial = 1.0;

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
            soma += 1.0 / fatorial;
        }
        
        return soma;
    }
    public static void main(String[] args) {
        int N = 5;
        double resultado = calcularS(N);
        System.out.println("O valor de S para N = " + N + " é: " + resultado);
    }
}