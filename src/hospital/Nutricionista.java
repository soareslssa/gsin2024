package hospital;

public class Nutricionista extends Medico {


    private String areaEspecializacao;

    // Construtor da classe Nutricionista, que recebe o nome do médico
    public Nutricionista(String nome) {
        // Chama o construtor da classe pai (Medico) passando o nome e a especialidade
        super(nome, "Nutrição");
    }

    // Método sobrescrito da classe pai para definir o atendimento de um paciente
    @Override
    public void atenderPaciente() {
        System.out.println("Está realizando atendimento...");
    }

    // Método para calcular o Índice de Massa Corporal (IMC) do paciente
    public void calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura); // Fórmula para calcular o IMC
        System.out.println("IMC: " + imc); // Exibe o resultado do IMC
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
}

