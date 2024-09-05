package escola;

// A classe "Aluno" herda (extends) da classe "Pessoa", o que significa que
// ela possui todos os atributos e métodos da classe "Pessoa".
public class Aluno extends Pessoa {


    private int matricula;
    private String turno;

    // Construtor da classe "Aluno" que recebe o nome e a idade do aluno
    // Utiliza o construtor da classe "Pessoa" (super) para definir esses atributos
    public Aluno(String nome, int idade) {
        super(nome, idade); // Chama o construtor da superclasse "Pessoa"
    }

    // Métodos "getter" e "setter" para acessar e modificar os atributos privados
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}

