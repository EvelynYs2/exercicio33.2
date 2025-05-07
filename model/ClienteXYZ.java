package model;

public class ClienteXYZ {
    public int codigo;
    public String nome, endereco, bairro, cpf, fone;

    public ClienteXYZ(int codigo, String nome, String endereco, String bairro, String cpf, String fone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
        this.fone = fone;
    }

    public String toString() {
        return codigo + " - " + nome + " - " + endereco + " - " + bairro + " - " + cpf + " - " + fone;

    }
    
}
