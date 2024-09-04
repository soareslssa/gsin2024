package cozinha;
public class Main {

    public static void main(String[] args) {
        // Cria um objeto Cozinheiro chamado "jacquin" com nome "Jacquin" e cargo "Chefe de Cozinha"
        Cozinheiro jacquin = new Cozinheiro("Jacquin", "Chefe de Cozinha");

        // Define o salário do jacquin para o valor do salário mínimo
        jacquin.setSalario(Pagamento.SALARIO_MINIMO);

        // Cria um objeto Garcom chamado "campeao" com nome "Campeao" e cargo "Barista"
        Garcom campeao = new Garcom("Campeao", "Barista");

        // Define o salário do campeao para o valor do salário mínimo
        campeao.setSalario(Pagamento.SALARIO_MINIMO);

        // Chama o método trabalhar() para o cozinheiro jacquin, que exibe uma mensagem sobre cozinhar
        jacquin.trabalhar();

        // Chama o método trabalhar() para o garçom campeao, que exibe uma mensagem sobre atendimento
        campeao.trabalhar();

        // Calcula o adicional noturno para jacquin e ajusta seu salário
        Pagamento.calcularAdicionalNoturno(jacquin);

        // Exibe o pagamento do cozinheiro jacquin, mostrando seu nome e o valor do salário ajustado
        Pagamento.pagarFuncionario(jacquin);

        // Exibe o pagamento do garçom campeao, mostrando seu nome e o valor do salário
        Pagamento.pagarFuncionario(campeao);
    }
}
