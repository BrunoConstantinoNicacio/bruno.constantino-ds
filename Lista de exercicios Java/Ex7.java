/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex7
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite a temperatura em Celsius: ");
		double temperatura = numero.nextDouble();
		
		temperatura = (temperatura * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é "+temperatura);
	}
}
