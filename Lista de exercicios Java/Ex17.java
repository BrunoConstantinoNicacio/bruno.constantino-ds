/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Ex17
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite sua nota: ");
		int nota = sc.nextInt();
		System.out.println("Digite sua frequencia: ");
		int frequencia = sc.nextInt();
		
		if (nota >= 7 && frequencia >= 75) {
		    System.out.println("Voce foi aprovado!");
		}
		else {
		    System.out.println("VOCE REPROVOU!");
		}
	}
}
