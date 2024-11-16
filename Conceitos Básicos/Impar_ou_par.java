import java.util.Scanner;

public class Impar_ou_par {
    // 3. Implemente um programa que determine se um número é par ou ímpar.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Digite qualquer número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(String.format("O número %d é par.", numero));
            } else {
                System.out.println(String.format("O número %d é ímpar.", numero));
            }
            scanner.close();
        }
    }
}
