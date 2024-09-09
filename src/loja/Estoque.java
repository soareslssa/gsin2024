package loja;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    // Lista estática para armazenar os produtos disponíveis no estoque
    private static List<Produto> estoqueDisponivel = new ArrayList<>();

    // Método estático para gerar um código único para cada produto
    private static int gerarCodigoProduto() {
        // O código do produto é baseado no tamanho atual do estoque
        return estoqueDisponivel.size() + 1;
    }

    // Método estático para cadastrar um novo produto no estoque
    public static void cadastrarNovoProduto(String nome, double valor, char tamanho) {
        Produto novoProduto = new Produto();
        novoProduto.setCodigo(gerarCodigoProduto());
        novoProduto.setNome(nome);
        novoProduto.setValor(valor);
        novoProduto.setTamanho(tamanho);

        estoqueDisponivel.add(novoProduto); // Adiciona o novo produto ao estoque
        System.out.println("Novo produto cadastrado");
        novoProduto.exibirDescricao();
    }

    // Método estático para listar todos os produtos atualmente em estoque
    public static void listarProdutosEmEstoque() {
        for (Produto produto : estoqueDisponivel) {
            produto.exibirDescricao();
        }
        System.out.println("Total Estoque: " + estoqueDisponivel.size());
    }

    // Método estático para remover um produto do estoque com base em seu código
    public static void removerProdutoEstoquePorCodigo(int codigo) {
        // Busca o produto no estoque pelo código
        Produto produtoRemovido = obterProdutoEstoquePorCodigo(codigo);
        if (produtoRemovido != null) { // Se o produto for encontrado, remove-o do estoque
            estoqueDisponivel.remove(produtoRemovido);
            System.out.println("Produto removido do estoque: " + codigo);
        }
    }

    // Método estático para obter um produto do estoque pelo código
    public static Produto obterProdutoEstoquePorCodigo(int codigo) {
        // Percorre a lista de produtos para encontrar o produto com o código especificado
        for (Produto produto : estoqueDisponivel) {
            if (produto.getCodigo() == codigo) { // Se encontrado, retorna o produto
                return produto;
            }
        }
        // Se não encontrado, exibe uma mensagem e retorna null
        System.out.println("Nenhum produto encontrado com este código: " + codigo);
        return null;
    }

    // Método estático para realizar o checkout de produtos no carrinho
    public static void checkout(Carrinho carrinho) {
        // Remove cada produto do estoque com base nos produtos presentes no carrinho
        for (Produto produto : carrinho.getListaProdutos()) {
            removerProdutoEstoquePorCodigo(produto.getCodigo());
        }
        carrinho.exibirCarrinho(); // Exibe os produtos do carrinho
        System.out.println("Compra finalizada com sucesso!"); // Confirma a finalização da compra
    }
}
