package loja;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private double valorTotal;
    private List<Produto> listaProdutos;

    public Carrinho() {
        this.valorTotal = 0;
        this.listaProdutos = new ArrayList<>();
    }

    public void listarProdutos() {
        for (Produto produto : listaProdutos) {
            produto.exibirDescricao();
        }
    }

    public void adicionarProduto(Produto novoProduto) {
        this.valorTotal += novoProduto.getValor();
        listaProdutos.add(novoProduto);
        System.out.println("Novo produto adicionado ao carrinho!");
    }

    public void exibirCarrinho() {
        System.out.println("Valor total:" + this.valorTotal);
        System.out.println("Qtd. Produtos: " + this.listaProdutos.size());
        listarProdutos();
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
