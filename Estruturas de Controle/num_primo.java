public class num_primo {
    // 8. Crie um programa que exiba os números primos de 1 a 100.
    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 100:");

        for (int numero = 2; numero <= 100; numero++) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
