package algoritmos;

public class MaiorElementoArray {

    public static void main(String[] args) {
        // Cria um array de inteiros com alguns valores
        int[] array = {26, 11, 34, 90, 2, 45, 70};

        // Inicializa a variável 'maior' com o valor do primeiro elemento do array
        int maior = array[0];

        // Loop para percorrer todos os elementos do array
        for (int i = 0; i < array.length; i++) {
            // Se o elemento atual for maior que o valor armazenado em 'maior', atualiza 'maior'
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        // Exibe o maior elemento encontrado no array
        System.out.println("Maior elemento: " + maior);
    }
}

