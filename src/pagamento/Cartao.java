package pagamento;

public abstract class Cartao implements IPagamento {

    private String numero;
    private int cvv;
    private String dataValidade;

    public Cartao(String numero, int cvv, String dataValidade) {
        this.numero = numero;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

}
