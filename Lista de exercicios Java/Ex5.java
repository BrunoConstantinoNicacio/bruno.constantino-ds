/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Ex5
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite seu salario: ");
		double numero1 = numero.nextDouble();
		
		if (numero1 < 2000){
		    numero1 = numero1 * 1.1;
	        System.out.println("Seu salario agora é de "+ numero1);
		}
		else if (numero1 >= 2000 && numero1 < 4000) {
		    numero1 = numero1 * 1.07;
		    System.out.println("Seu salario agora é de "+ numero1);
		}
	    else if (numero1 >= 4000) {
	         numero1 = numero1 * 1.05;
	        System.out.println("Seu salario agora é de "+ numero1);
	    }
}
}