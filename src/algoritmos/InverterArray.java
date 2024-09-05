package algoritmos;

import java.util.Arrays;

public class InverterArray {

    public static void main(String[] args) {
        // Define um array de inteiros com 5 elementos
        int[] array = {1, 2, 3, 4, 5};

        // Cria um novo array para armazenar o array invertido, com o mesmo comprimento do array original
        int[] arrayInvertido = new int[array.length];

        // Loop para percorrer todos os elementos do array original
        for (int i = 0; i < array.length; i++) {
            // Atribui o elemento do final do array original ao início do array invertido
            arrayInvertido[i] = array[array.length - i - 1];
        }

        // Exibe o array original
        System.out.println("Array original: " + Arrays.toString(array));
        // Exibe o array invertido
        System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));
    }
}

