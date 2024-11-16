public class Inverter_Array {
    // 15. Crie um programa que inverta a ordem dos elementos em um array.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        inverterArray(array);

        System.out.println("Array após inversão:");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void inverterArray(int[] array) {
        int esquerda = 0;
        int direita = array.length - 1;
        
        while (esquerda < direita) {
            int temp = array[esquerda];
            array[esquerda] = array[direita];
            array[direita] = temp;

            esquerda++;
            direita--;
        }
    }
}
