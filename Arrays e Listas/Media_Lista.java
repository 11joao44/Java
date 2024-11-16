public class Media_Lista {
    // 13. Escreva um programa que calcule a média dos valores em uma lista.
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        double media = calcularMedia(array);

        System.out.println("A média dos valores no array é: " + media);
    }

    public static double calcularMedia(int[] array) {
        int soma = 0;
        for (int valor : array) {
            soma += valor;
        }
        return (double) soma / array.length;
    }
}
