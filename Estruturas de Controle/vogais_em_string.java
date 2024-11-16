import java.util.Scanner;

public class vogais_em_string {
    // 9. Faça um programa que conte a quantidade de vogais em uma string.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Digite uma string: ");
            String entrada = scanner.nextLine();

            int quantidadeVogais = contarVogais(entrada);

            System.out.println("A string contém " + quantidadeVogais + " vogais.");

            scanner.close();
        }
    }
    
    public static int contarVogais(String str) {

        str = str.toLowerCase();
        int contador = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contador++;
            }
        }

        return contador;
    }
}
