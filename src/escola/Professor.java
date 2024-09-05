package escola;

// A classe "Professor" herda da classe "Pessoa".
// Representa um professor com uma especialidade específica.
public class Professor extends Pessoa {
    private String especialidade;

    // Construtor da classe "Professor" que recebe o nome, idade e especialidade do professor.
    // Utiliza o construtor da superclasse "Pessoa" para definir o nome e a idade.
    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade); // Chama o construtor da superclasse "Pessoa"
        this.especialidade = especialidade; // Define a especialidade do professor
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

