package model;

public class ClienteABC {
    public int codigo;
    public String nome, endereco, telefone, bairro, cpf, rg;

    public ClienteABC(int codigo, String nome, String endereco, String telefone, String bairro, String cpf, String rg) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.bairro = bairro;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String toString() {
        return codigo + " - " + nome + " - " + endereco + " - " + telefone + " - " + bairro + " - " + cpf + " - " + rg;

    }
    
}
