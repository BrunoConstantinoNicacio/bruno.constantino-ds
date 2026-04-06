/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex4_l3
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Digite um numero: ");
		int numero = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
		    int resultado = numero * i;
		    System.out.println("A tabuada do numero "+numero+" é: "+resultado);
		}
	}
}
