/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Ex18
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Quantos kWh voce consumiu: ");
		int kwh = sc.nextInt();
		
		if (kwh < 100) {
		    double consumo = kwh * 0.2;
		    System.out.println("O consumo foi de "+consumo);
		}
		else if (kwh >= 100) {
		    double consumo = kwh * 0.25;
		    System.out.println("O consumo foi de "+consumo);
		}
	}
}
