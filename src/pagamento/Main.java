package pagamento;

public class Main {

    public static void main(String[] args) {
        CartaoCredito credito = new CartaoCredito("123456789", 123, "06/28", 2);
        credito.realizarPagamento(1200);

        Pix pix = new Pix("21975251168");
        pix.realizarPagamento(1200);
    }
}
