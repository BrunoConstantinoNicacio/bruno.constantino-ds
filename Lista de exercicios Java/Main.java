/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero1 = numero.nextInt();
        
        if (numero1 % 2 == 0){
            System.out.println("O numero "+numero1+" e par");
        }
        else {
            System.out.println("O numero "+numero1+" e impar");
	}
}
}