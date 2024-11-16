import java.util.Scanner;

public class Calculadora {
    // 2. Crie um programa que calcule a soma de dois números inteiros e exiba o resultado.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro valor inteiro: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Digite o segundo valor inteiro: ");
            int num2 = scanner.nextInt();
            
            int soma = num1 + num2;
            
            System.out.println(num1 + " + " + num2 + " = " + soma);
        }
    }
}
