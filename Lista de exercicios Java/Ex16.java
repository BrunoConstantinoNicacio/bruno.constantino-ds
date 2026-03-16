/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex16
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite o usuario: ");
        String user = sc.next();
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();
        
        if (user.equals ("admin") && senha == 1234) {
            System.out.println("O acesso foi permitido!");
        }
        else {
            System.out.println("ACESSO NEGADO!");
        }
	}
}
