package pagamento;

public class Pix implements IPagamento {

    private String codigo;
    private String chave;

    public Pix(String chave) {
        this.chave = chave;
        gerarCodigo();
    }

    private void gerarCodigo() {
        for (int i = 0; i < this.chave.length(); i++) {
            if (this.chave.charAt(i) % 2 == 0) {
                this.codigo += this.chave.charAt(i) * 2;
                continue;
            }
            this.codigo += this.chave.charAt(i);
        }
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Copie o código e realize o pagamento: " + this.codigo);
    }
}
