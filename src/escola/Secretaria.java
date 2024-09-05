package escola;

import java.util.Random;

public class Secretaria {

    // Constantes para representar os turnos "Manhã" e "Tarde"
    private static final String TURNO_TARDE = "Tarde";
    private static final String TURNO_MANHA = "Manha";

    // Método privado e estático que gera um número aleatório para a matrícula do aluno
    private static int gerarMatricula() {
        int numeroAleatorio = new Random().nextInt(100); // Gera um número aleatório de 0 a 99
        return numeroAleatorio;
    }

    // Método público e estático para matricular um aluno
    public static void matricularAluno(Aluno aluno) {
        aluno.setMatricula(gerarMatricula()); // Define a matrícula do aluno com um número aleatório

        // Define o turno do aluno com base na idade: se a idade for par, o turno é "Tarde"; se for ímpar, o turno é "Manhã"
        String turno = aluno.getIdade() % 2 == 0 ? TURNO_TARDE : TURNO_MANHA;
        aluno.setTurno(turno);

        // Exibe uma mensagem indicando que um novo aluno foi matriculado
        System.out.println("Novo aluno matriculado: " + aluno.getMatricula() + " - " + aluno.getNome());
    }
}
