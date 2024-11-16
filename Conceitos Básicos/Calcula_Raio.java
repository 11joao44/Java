import java.util.Scanner;

public class Calcula_Raio {
    public static void main(String[] args) {
        // 4. Faça um programa que leia o raio de um círculo e calcule sua área.
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Digite o raio do círculo: ");

            double raio = scanner.nextDouble();
            
            double area = Math.PI * Math.pow(raio, 2);

            System.out.println(String.format("A área do círculo com raio %.2f é %.2f.", raio, area));
    
            scanner.close();
        }
    }
}
