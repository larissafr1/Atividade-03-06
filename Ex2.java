import java.util.Scanner;
public class Ex2
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []numeros=new int[15];
	System.out.println("Insira 15 numeros: ");
	for(int i=0;i<numeros.length;i++){
	    System.out.print("Número "+(i+1)+": ");
	    numeros[i]=sc.nextInt();
	}
	System.out.println("Posições dos elementos iguais ao valor 30: ");
	boolean encontrou= false;
		for(int i=0;i<numeros.length;i++){
		    if (numeros[i]==30){
		        System.out.println("Elemento 30 encontrado na posição: "+ (i+1));
		        encontrou=true;
		    }
		}
		if(!encontrou){
		    System.out.println("Não tem elementos igual a 30.");
		    sc.close();
		}
	}
}