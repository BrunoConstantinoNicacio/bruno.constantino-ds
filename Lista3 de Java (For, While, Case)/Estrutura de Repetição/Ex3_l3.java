/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex3_l3
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Digite um numero");
		int numero = input.nextInt();
		while (numero != 0) {
		    System.out.println("O numero por enquanto é "+numero);
		    System.out.println("Digite um novo numero: ");
		    int numerodois = input.nextInt();
		    numero = numero + numerodois;
		}
	}
}
