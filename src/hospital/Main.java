package hospital;

public class Main {

    public static void main(String[] args) {
        Nutricionista novaNutricionista = new Nutricionista("Ana");
        Psicologo novaPsicologa = new Psicologo("Carolina");

        DepartamentoRH.contratarMedico(novaNutricionista);
        DepartamentoRH.contratarMedico(novaPsicologa);

        novaNutricionista.atenderPaciente();
        novaPsicologa.atenderPaciente();

        novaPsicologa.diagnosticarPacientePeloNome("natan");
        novaNutricionista.calcularIMC(59, 1.68);

        DepartamentoRH.demitirMedico(novaNutricionista);
    }
}
