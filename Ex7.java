import java.util.Scanner;

public class Ex7 {
    public static int converterParaSegundos(int horas, int minutos, int segundos) {
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        return totalSegundos;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();
        int totalSegundos = converterParaSegundos(horas, minutos, segundos);
        System.out.println("Total de segundos: " + totalSegundos);
        
        scanner.close();
    }
}