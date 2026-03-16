/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex11
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0) {
		    System.out.println("O ano é bissexto!");
		}
		else {
		    System.out.println("O ano nao é bissexto!");
		}
	}
}
