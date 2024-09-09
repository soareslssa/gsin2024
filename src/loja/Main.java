package loja;

public class Main {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente("Joao", 16863888999L);

        Estoque.cadastrarNovoProduto("Camisa", 125,'P');
        Estoque.cadastrarNovoProduto("Camisa", 125,'M');
        Estoque.cadastrarNovoProduto("Camisa", 125,'G');
        Estoque.cadastrarNovoProduto("Vestido", 250,'P');
        Estoque.cadastrarNovoProduto("Vestido", 250,'M');
        Estoque.cadastrarNovoProduto("Vestido", 250,'G');

        Estoque.listarProdutosEmEstoque();

        Estoque.removerProdutoEstoquePorCodigo(1);

        Produto produtoSelecionado = Estoque.obterProdutoEstoquePorCodigo(2);
        novoCliente.getCarrinho().adicionarProduto(produtoSelecionado);

        Estoque.checkout(novoCliente.getCarrinho());
    }
}
