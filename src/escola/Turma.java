package escola;

import java.util.List;

public class Turma {

    private int numero;
    private Curso curso;
    private Professor professor;
    private List<Aluno> alunos;

    // Construtor da classe "Turma" que recebe o número da turma, o curso e o professor responsável
    public Turma(int numero, Curso curso, Professor professor) {
        this.numero = numero;
        this.curso = curso;
        this.professor = professor;
    }

    // Método para listar todos os alunos matriculados na turma
    public void listarAlunosMatriculados() {
        for (Aluno aluno : this.alunos) { // Itera sobre a lista de alunos
            System.out.printf("Matricula: %d - Nome: %s \n", aluno.getMatricula(), aluno.getNome());
        }
    }

    // Método para exibir a descrição da turma, incluindo o número, o curso, o professor e a lista de alunos
    public void exibirDescricao() {
        System.out.println(" ---------------------------------");
        System.out.println(this.numero + " - " + this.curso.getNome());
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println(" ---------------------------------");
        listarAlunosMatriculados(); // Chama o método para listar os alunos matriculados
    }

    // Métodos "getter" e "setter" para acessar e modificar os atributos privados
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
