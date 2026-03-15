/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite um numero: ");
		int numero1 = numero.nextInt();
		
		if (numero1 < 0) {
		    System.out.println("O numero é negativo");
		}
		else if (numero1 == 0) {
		    System.out.println("O numero é igual a zero");
		}
		else if (numero1 > 0) {
		    System.out.println("O numero é positivo");
		}
	}
}