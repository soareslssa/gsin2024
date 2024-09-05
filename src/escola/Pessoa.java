package escola;

// Classe abstrata "Pessoa" que representa uma pessoa genérica.
// Como é abstrata, não pode ser instanciada diretamente.
public abstract class Pessoa {


    private String nome;
    private int idade;
    private char sexo;

    // Construtor da classe Pessoa, que define o nome e a idade quando um objeto é criado
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos "getter" e "setter" para acessar e modificar os atributos privados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
