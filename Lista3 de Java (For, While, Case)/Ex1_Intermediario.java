/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex1_Intermediario
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int numeropar = 0;
	    int numeroimpar = 0;
	    
		System.out.println("Quantos numeros voce quer digitar: ");
		int numero = input.nextInt();
		int[] numeros= new int[numero];
		for (int i = 0; i < numero; i++)
		{
		    System.out.println("Digite o "+(i + 1)+"º numero: ");
		    int numerodois = input.nextInt();
		    
		     numeros[i] = numerodois;
		     
		     if (numeros[i] % 2 == 0) 
		     {
		         numeropar++;
		     }
		     else {
		         numeroimpar++;
		     }
		}
		System.out.println("A quantidade de numero pares é "+numeropar);
		System.out.println("A quantidade de numero impares é "+numeroimpar);
	}
}
