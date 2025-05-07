package model;

public class ProdutoABC {
    public int codigo;
    public String nome, grupo, unidade;
    public double precoVenda;
    public int qtdEstoque;

    public ProdutoABC(int codigo, String nome, String grupo, double precoVenda, String unidade, int qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.precoVenda = precoVenda;
        this.unidade = unidade;
        this.qtdEstoque = qtdEstoque;
    }

    public String toString() {
        return codigo + " - " + nome + " - " + grupo + " - R$" + precoVenda + " - " + unidade + " - " + qtdEstoque + " un";

    }

    }
    

