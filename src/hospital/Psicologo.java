package hospital;

public class Psicologo extends Medico {

    private String abordagem;

    // Construtor da classe Psicologo, que recebe o nome do psicólogo
    public Psicologo(String nome) {
        // Chama o construtor da classe pai (Medico) passando o nome e a especialidade "Psicologia Clinica"
        super(nome, "Psicologia Clinica");
    }

    // Método sobrescrito da classe pai para definir o atendimento de um paciente
    @Override
    public void atenderPaciente() {
        System.out.println("Está realizando uma sessão de terapia...");
    }

    // Método para diagnosticar um paciente verificando se o nome é um palíndromo
    public void diagnosticarPacientePeloNome(String nomePaciente) {
        String invertido = "";

        // Loop para inverter o nome do paciente
        for (int i = 0; i < nomePaciente.length(); i++) {
            invertido += nomePaciente.charAt(nomePaciente.length() - i - 1);
        }

        // Compara o nome original com o nome invertido, ignorando diferenças de maiúsculas e minúsculas
        if (nomePaciente.equalsIgnoreCase(invertido)) {
            System.out.println("Diagnostico paciente: Doido");
            return;
        }

        System.out.println("Diagnostico paciente: Normal");
    }


    public String getAbordagem() {
        return abordagem;
    }


    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
    }
}

