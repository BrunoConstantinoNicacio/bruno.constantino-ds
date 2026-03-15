/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite o primeiro numero: ");
		int numero1 = numero.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = numero.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int numero3 = numero.nextInt();
		
		int soma = ((numero1 + numero2 + numero3)/3);
		
	    if (soma >= 7) {
	        System.out.println("Voce foi aprovado");
	    }
	    else if (soma >= 5 && soma < 7)  {
	        System.out.println("Voce esta de recuperacao");
	    }
	    else if (soma < 5) {
	        System.out.println("Voce reprovou de ano");
	    }
	}
}