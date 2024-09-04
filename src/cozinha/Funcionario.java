package cozinha;

/**
 * Classe abstrata que representa um funcionário da cozinha.
 * Define os atributos comuns e um método abstrato que deve ser implementado por subclasses.
 */
public abstract class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    /**
     * Construtor que inicializa o nome e o cargo do funcionário.
     */
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses.
     * Define o comportamento do trabalho do funcionário.
     */
    public abstract void trabalhar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
