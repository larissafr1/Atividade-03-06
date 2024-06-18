import java.util.Scanner;

public class Ex9 {
    public static double calcularVolume(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        
        double volume = calcularVolume(raio);
        
        System.out.println("O volume da esfera com raio " + raio + " é: " + volume);
        
        scanner.close();
    }
}