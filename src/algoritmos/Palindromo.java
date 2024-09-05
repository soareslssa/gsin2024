package algoritmos;

public class Palindromo {

    public static void main(String[] args) {
        String texto = "natan"; // Define o texto a ser verificado se é um palíndromo
        String textoInvertido = ""; // Variável que armazenará o texto invertido

        // Loop para inverter o texto
        for (int i = 0; i < texto.length(); i++) {
            // Constrói a string invertida, caracter por caracter, começando do final do texto original
            textoInvertido += texto.charAt(texto.length() - i - 1);
        }

        // Verifica se o texto invertido é igual ao texto original (ignorando maiúsculas/minúsculas)
        if (textoInvertido.equalsIgnoreCase(texto)) {
            System.out.println("É PALINDROMO!");
            return; // Sai do método main
        }

        // Caso contrário, o texto não é um palíndromo
        System.out.println("NÃO É PALINDROMO!");
    }
}

