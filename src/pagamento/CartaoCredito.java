package pagamento;

public class CartaoCredito extends Cartao {

    private int quantidadeParcelas;
    private final double JUROS = 0.05;

    public CartaoCredito(String numero, int cvv, String dataValidade, int quantidadeParcelas) {
        super(numero, cvv, dataValidade);
        this.quantidadeParcelas = quantidadeParcelas;
    }


    @Override
    public void realizarPagamento(double valor) {
        double valorFinal = this.quantidadeParcelas > 1 ? valor + (valor * JUROS) : valor;
        System.out.printf("Parcelas %d x de R$ %f \n", this.quantidadeParcelas, (valorFinal / this.quantidadeParcelas));
        System.out.println("Valor final: R$ " + (valorFinal));
    }


}
