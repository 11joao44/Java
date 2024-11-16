import java.util.HashSet;
import java.util.Set;

public class Elementos_sUnicos {
    // 14. Escreva um programa que receba um array de números inteiros e imprima os elementos sem repetição.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6};

        imprimirUnicos(array);
    }

    public static void imprimirUnicos(int[] array) {
        Set<Integer> elementosUnicos = new HashSet<>();
        for (int valor : array) {
            elementosUnicos.add(valor);
        }

        System.out.println("Elementos sem repetição:");
        for (int valor : elementosUnicos) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
