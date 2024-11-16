public class Valor_maximo {
    // 11. Crie um programa que encontre o valor máximo em um array de inteiros.
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 6};

        int max = encontrarMaximo(array);

        System.out.println("O valor máximo no array é: " + max);
    }

    public static int encontrarMaximo(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}