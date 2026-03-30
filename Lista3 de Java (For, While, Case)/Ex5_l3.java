/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex5_l3
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Digite um numero <= 7: ");
		int semana = input.nextInt();
		
		switch (semana) {
		    case 1:
		        System.out.println("Hoje é segunda-feira");
		        break;
		    case 2:
		        System.out.println("Hoje é terça-feira");
		        break;
		    case 3:
		        System.out.println("Hoje é quarta-feira");
		        break;
		    case 4:
		        System.out.println("Hoje é quinta-feira");
		        break;
		    case 5:
		        System.out.println("Hoje é sexta-feira");
		        break;
		    case 6:
		        System.out.println("Hoje é sabado!");
		        break;
		    case 7:
		        System.out.println("Hoje é domingo!");
		        break;
		}
	}
}
