/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Ex6
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite sua idade: ");
		int idade = numero.nextInt();
		
		if (idade < 16) {
		    System.out.println("Voce nao pode votar!");
		}
		else if (idade == 16 || idade == 17 || idade >= 70) {
		    System.out.println("Seu voto é opcional!");
		}
		else if (idade >= 18 && idade < 70) {
		    System.out.println("Seu voto é obrigatorio!");
		}
	}
}