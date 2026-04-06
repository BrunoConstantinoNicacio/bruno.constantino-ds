import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu cpf: ");
        String CPF = input.next();

        CPF = CPF.replaceAll("[^0-9]", "");

        if (CPF.length() != 11) {
            System.out.println("CPF inválido!");
            return;
        }

        int[] numeros_cpf = new int[11];

        for (int i = 0; i < 11; i++) {
            numeros_cpf[i] = CPF.charAt(i) - '0';
        }

        // Primeiro dígito
        int soma = 0;
        for (int i = 0, j = 10; j >= 2; i++, j--) {
            soma += numeros_cpf[i] * j;
        }

        int dig1 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        if (dig1 != numeros_cpf[9]) {
            System.out.println("CPF inválido!");
            return;
        }

        // Segundo dígito
        int somadois = 0;
        for (int i = 0, j = 11; j >= 2; i++, j--) {
            somadois += numeros_cpf[i] * j;
        }

        int dig2 = (somadois % 11 < 2) ? 0 : 11 - (somadois % 11);

        if (dig2 == numeros_cpf[10]) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }
}