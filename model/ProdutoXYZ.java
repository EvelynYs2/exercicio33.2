package model;

public class ProdutoXYZ {
    public int codigo;
    public String nome, grupo, unidade;
    public double precoCusto, precoVenda;
    public int qtdEstoque;

    public ProdutoXYZ(int codigo, String nome, String grupo, double precoCusto, double precoVenda, String unidade, int qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.unidade = unidade;
        this.qtdEstoque = qtdEstoque;
    }

    public String toString() {
        return codigo + " - " + nome + " - " + grupo + " - Custo: R$" + precoCusto + " - Venda: R$" + precoVenda + " - " + unidade + " - " + qtdEstoque + " un";
    }
}
