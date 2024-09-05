package escola;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Cria três objetos do tipo "Aluno" com diferentes nomes e idades
        Aluno aluno1 = new Aluno("Joao", 20);
        Aluno aluno2 = new Aluno("Pedro", 21);
        Aluno aluno3 = new Aluno("Maria", 22);

        // Cria um objeto "Professor" representando o Professor Girafales, com especialidade em POO
        Professor professorGirafales = new Professor("Girafales", 45, "POO");

        // Cria um objeto "Curso" representando o curso de Programação Orientada a Objetos
        Curso cursoPoo = new Curso("Programação Orientada a Objetos", 2);

        // Cria um objeto "Turma" associando o curso de POO ao Professor Girafales
        Turma turmaGsin = new Turma(2024, cursoPoo, professorGirafales);

        // Matricula os alunos usando o método estático da classe "Secretaria"
        Secretaria.matricularAluno(aluno1);
        Secretaria.matricularAluno(aluno2);
        Secretaria.matricularAluno(aluno3);

        // Cria uma lista de alunos matriculados e adiciona os alunos criados
        List<Aluno> alunosMatriculados = new ArrayList<>();
        alunosMatriculados.add(aluno1);
        alunosMatriculados.add(aluno2);
        alunosMatriculados.add(aluno3);

        // Define a lista de alunos na turma criada
        turmaGsin.setAlunos(alunosMatriculados);

        // Exibe a descrição da turma, incluindo o curso, professor e alunos matriculados
        turmaGsin.exibirDescricao();
    }
}
