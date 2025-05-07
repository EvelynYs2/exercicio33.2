package model;

public class ProdutoUnificado {
    int codigo;
    String nome, grupo, unidade;
    double precoVenda;
    int qtdEstoque;

public ProdutoUnificado(int codigo, String nome, String grupo, String unidade, double precoVenda, int qtdEstique, int qtdEstoque) {
    this.codigo = codigo;
    this.nome = nome;
    this.grupo = grupo;
    this.unidade = unidade;
    this.precoVenda = precoVenda;
    this.qtdEstoque = qtdEstoque;
}

public ProdutoUnificado(int codigo2, String nome2, String grupo2, double precoVenda2, String unidade2,
        int qtdEstoque2) {
}

public String toString() {
    return codigo + " - " + nome + " - " + grupo + " - " + unidade + " - " + precoVenda + " -  " + qtdEstoque + " un";
 }
    
}
