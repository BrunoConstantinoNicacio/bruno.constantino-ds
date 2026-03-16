/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex12
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite o primeiro numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Escolha um dos operadores: (+, -, *, /");
		String operador = sc.next();
		
		if (operador.equals ("+")) {
		    int numero = numero1 + numero2;
		    System.out.println("A soma dos dois numero é "+numero);
		}
		else if (operador.equals ("-")) {
		    int numero = numero1 - numero2;
		    System.out.println("A subtração dos dois numero é "+numero);
		}
		else if (operador.equals ("*")) {
		    int numero = numero1 * numero2;
		    System.out.println("A multiplicação dos dois numero é "+numero);
		}
		else if (operador.equals ("/")) {
		    int numero = numero1 / numero2;
		    System.out.println("A divisão dos dois numero é "+numero);
		} 
	}
}
