package model;

public class ClienteUnificado {
    public int codigo;
    public String nome, endereco, telefone, bairro, cpf, rg;

    public ClienteUnificado(int codigo, String nome, String endereco, String bairro, String cpf, String rg) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
        this.rg = rg;
    }

    public ClienteUnificado(int codigo2, String nome2, String endereco2, String telefone2, String bairro2, String cpf2,
            String rg2) {
        //TODO Auto-generated constructor stub
    }

    public String toString() {
        return codigo + " - " + nome + " - " + endereco + " - " + bairro + " - "  + cpf + " - " + rg;

    }

    
}
