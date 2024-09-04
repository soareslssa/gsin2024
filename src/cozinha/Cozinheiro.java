package cozinha;

/**
 * Classe que representa um cozinheiro, que é um tipo específico de funcionário.
 */
public class Cozinheiro extends Funcionario {

    private String especialidade;

    public Cozinheiro(String nome, String cargo) {
        super(nome, cargo);
    }

    /**
     * Implementa o método de trabalho para o cozinheiro.
     * Exibe uma mensagem indicando que o cozinheiro está cozinhando.
     */
    @Override
    public void trabalhar() {
        System.out.println(this.getNome() + " está cozinhando....");

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
