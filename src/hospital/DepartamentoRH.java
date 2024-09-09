package hospital;

public class DepartamentoRH {

    private static final String NOME_HOSPITAL = "Hospital Central GSIN";

    public static void demitirMedico(Medico medico) {
        String nomeMedico = medico.getNome();
        String nomeInvertido = "";
        for (int i = 0; i < nomeMedico.length(); i++) {
            nomeInvertido += nomeMedico.charAt(nomeMedico.length() - i - 1);
        }

        System.out.println(nomeInvertido + " foi demitido!");
    }

    public static void contratarMedico(Medico medico) {
        medico.setHospital(NOME_HOSPITAL);
        System.out.println(medico.getNome() + " foi contratado!");
    }

}
