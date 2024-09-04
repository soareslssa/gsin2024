package cozinha;

/**
 * Classe responsável pelo cálculo e pagamento de funcionários.
 */
public class Pagamento {

    public static final double SALARIO_MINIMO = 1320;
    // Percentual de adicional noturno (20%)
    private static final double ADICIONAL_NOTURNO = 0.20;

    /**
     * Calcula o adicional noturno para um funcionário e ajusta seu salário.
     * O adicional é 20% do salário atual do funcionário.
     *
     * @param funcionario O funcionário para o qual o adicional noturno será calculado.
     */
    public static void calcularAdicionalNoturno(Funcionario funcionario) {
        // Calcula o valor do adicional noturno
        double adicionarNoturno = funcionario.getSalario() * ADICIONAL_NOTURNO;

        // Adiciona o valor ao salário do funcionário
        funcionario.setSalario(funcionario.getSalario() + adicionarNoturno);
    }

    /**
     * Exibe o pagamento de um funcionário.
     * Mostra o nome do funcionário e o valor total a ser pago.
     *
     * @param funcionario O funcionário que receberá o pagamento.
     */
    public static void pagarFuncionario(Funcionario funcionario) {
        // Mostra o nome do funcionário
        System.out.println("Pagando funcionario: " + funcionario.getNome());

        // Mostra o valor do pagamento
        System.out.println("Valor R$: " + funcionario.getSalario());
    }


}
