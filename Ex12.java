import java.util.Scanner;

public class Ex12{
    public static String obterUltimoNome(String nomeCompleto) {
        String[] partesNome = nomeCompleto.split(" ");
                String ultimoNome = partesNome[partesNome.length - 1];
        
        return ultimoNome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();
        
        String ultimoNome = obterUltimoNome(nomeCompleto);
        System.out.println("Último nome: " + ultimoNome);
        
        scanner.close();
    }
}