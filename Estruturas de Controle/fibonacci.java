import java.util.Scanner;

public class fibonacci {
    // 10. Escreva um programa que imprima a sequência de Fibonacci com N termos, onde N é fornecido pelo usuário.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Digite o número de termos da sequência de Fibonacci: ");
            int n = scanner.nextInt();
    
            if (n <= 0) {
                System.out.println("O número de termos deve ser maior que 0.");
            } else {
                System.out.println("Sequência de Fibonacci com " + n + " termos:");
                imprimirFibonacci(n);
            }
    
            scanner.close();
        }
    }

    public static void imprimirFibonacci(int n) {
        long a = 0;
        long b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            long proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println();
    }
}
