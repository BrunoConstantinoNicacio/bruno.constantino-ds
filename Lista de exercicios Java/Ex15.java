/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade > 0 && idade <= 12) {
		    System.out.println("Voce e criança!");
		}
		else if (idade >= 13 && idade <= 17) {
		    System.out.println("Voce é adolescente!");
		} 
		else if (idade >= 18 && idade <=59) {
		    System.out.println("Voce é adulto!");
		}
		else if (idade >= 60) {
		    System.out.println("Voce é idoso!");
		}
		else {
		    System.out.println("Voce nao existe!");
		}
	}
}
