/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite a sua altura: ");
		float altura = sc.nextFloat();
		System.out.println("Digite o seu sexo: ");
		String sexo = sc.next();
		
		if (sexo.equals ("Masculino")) {
		    double peso = (72.7 * altura) - 58;
		    System.out.println("O seu peso ideal é " + peso);
		}
		else if (sexo.equals ("Feminino")) {
		    double peso = (72.7 * altura) - 58;
		    System.out.println("O seu peso ideal é " + peso);
		} 
	}
}
