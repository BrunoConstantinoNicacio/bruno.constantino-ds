/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex13
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite sua nota: ");
		int nota = sc.nextInt();
		
		if (nota < 0 || nota > 10) {
		    System.out.println("A nota NAO é invalida");
		}
	    else {
	        System.out.println("A nota é valida!");
	    }
	}
}
