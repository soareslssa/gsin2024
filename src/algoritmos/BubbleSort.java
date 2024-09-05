package algoritmos;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(array);
    }

    /**
     * compara um valor com o valor do lado e joga para o final da fila o valor maior.
     * ordenando o array.
     * 1 - percorrer de 2 em 2 comparando e fazendo a troca
     * 2 - quantidade maxima de vezes é baseado na quantidade de elementos do vetor
     *
     * @param vetor
     */
    public static void bubbleSort(int[] vetor) {
        int aux; // Variável auxiliar para troca de elementos
        boolean trocou; // Variável de controle para verificar se o vetor está ordenado

        // Primeiro loop para percorrer todos os elementos do vetor
        for (int i = 0; i < vetor.length; i++) {
            trocou = false; // Suponha que o vetor esteja ordenado no início de cada passagem

            // Segundo loop para comparar elementos adjacentes
            for (int j = 0; j < (vetor.length - 1); j++) {
                // Se o elemento atual for maior que o próximo, faz a troca
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j]; // Armazena o valor do elemento atual em uma variável auxiliar
                    vetor[j] = vetor[j + 1]; // Coloca o próximo elemento na posição atual
                    vetor[j + 1] = aux; // Coloca o valor armazenado na próxima posição
                    trocou = true; // Indica que uma troca foi feita, então o vetor não estava ordenado
                }
            }

            // Se nenhuma troca foi feita, o vetor já está ordenado, e o loop externo é interrompido
            if (!trocou) {
                break;
            }
        }

        imprimirVetor(vetor); // Chama um método para imprimir o vetor ordenado
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("Vetor: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }

}