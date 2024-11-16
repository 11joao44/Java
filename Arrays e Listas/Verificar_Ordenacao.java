public class Verificar_Ordenacao {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        boolean ordenado = estaOrdenado(array);

        if (ordenado) {
            System.out.println("O array está ordenado de forma crescente.");
        } else {
            System.out.println("O array não está ordenado de forma crescente.");
        }
    }

    public static boolean estaOrdenado(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
