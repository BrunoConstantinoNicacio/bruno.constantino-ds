/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex9
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite o primeiro numero: ");
		int numero1 = numero.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = numero.nextInt();
		
		if (numero1 % numero2 == 0) {
		    System.out.println("O primeiro numero é divisivel pelo segundo!");
		}
		else {
		    System.out.println("O primeiro numero NAO é divisivel pelo segundo!");
		}
	}
}
