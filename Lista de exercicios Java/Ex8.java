/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex8
{
	public static void main(String[] args) {
	    Scanner numero = new Scanner(System.in);
	    
		System.out.println("Digite o preco do produto: ");
		double preco = numero.nextDouble();
		
		if (preco > 100) {
		    preco = preco * 0.8;
		    System.out.println("O preço com desconto é de "+preco);
		}
		else {
		    preco = preco * 0.9;
		    System.out.println("O preço com desconto é de "+preco);
		}
	}
}
