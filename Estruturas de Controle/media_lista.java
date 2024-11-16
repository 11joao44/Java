import java.util.Scanner;

public class media_lista {
    // 7. Implemente um programa que calcule a média de uma lista de números.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            System.out.print("Digite o terceiro número inteiro: ");
            int num3 = scanner.nextInt();

            int[] lista = {num1, num2, num3};

            float media = (lista[0] + lista[1] + lista[2]) / 3.0f;
            
            System.out.println("A média de " + num1 + ", " + num2 + ", " + num3 + " é igual a " + media);
            scanner.close();
        }
    }
}
