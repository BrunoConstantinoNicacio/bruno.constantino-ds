/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite um numero: ");
		int numero1 = numero.nextInt();
		
		System.out.println("Digite outro numero: ");
		int numero2 = numero.nextInt();
		
		if (numero1 > numero2) {
		    System.out.println("O primeiro numero é o maior");
		}
		else if (numero1 == numero2) {
		    System.out.println("Os dois numeros são iguais");
		}
		else {
		    System.out.println("O segundo numero é o maior");
		}
		
		
	}
}