import java.util.Scanner;;
public class Ex1
{
	public static void main(String[] args) {
		Scanner par = new Scanner(System.in);
		int [] numeros = new int [6];
		int quantPares=0, quantImpares=0;
		
		System.out.println("Escreva os números inteiros: ");
		
		for(int i=0;i<numeros.length;i++){
		    System.out.println("Numero"+(i+1)+":");
		numeros[i]= par.nextInt();
		}
		for(int numero:numeros){
		    quantImpares++;
		    if(numero%2==0){
		}else{
		    quantPares++;
		}
		}
		System.out.println("Quantidade de pares:"+quantPares);
		System.out.println("Numeros pares são: ");
		for (int numero:numeros){
		    if (numero%2==0){
		     System.out.println(numero+" ");   
		    }
		}
	System.out.println("Quantidade de impares:"+quantImpares);
		System.out.println("Numeros pares são: ");	
		for(int numero:numeros){
		    if(numero%2!=0){
		        		     System.out.println(numero+" ");   
		    }
		}
	}
}
