package escola;

public class Curso {

    private String nome;
    private int duracaoMeses;

    public Curso(String nome, int duracaoMeses) {
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }
}
