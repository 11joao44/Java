import java.util.Scanner;

public class Cumprimente {
    // 5. Crie um programa que solicite o nome do usuário e o cumprimente.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Qual o seu nome?: ");

            String nome = scanner.nextLine();

            System.out.println("Olá, " + nome + " Prazer em te conhecer!");

            scanner.close();
        }
    }
}