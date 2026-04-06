/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    		
		int inicio = 0;
		
	    
		System.out.println("Digite um numero: ");
		int cont = input.nextInt();

		while (inicio <= cont) {
		    System.out.println("Numero " + inicio); 
		    inicio++;
		}
	}
}
