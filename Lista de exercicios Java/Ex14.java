/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex14
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite a distancia em Km: ");
		double distancia = sc.nextDouble();
		System.out.println("Digite o consumo do carro em km/L: ");
		double consumo = sc.nextDouble();
		
		double litros = distancia / consumo;
		
		System.out.println("Serão gastos "+litros+" litros");
	}
}
