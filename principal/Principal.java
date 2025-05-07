package principal;

import model.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Clientes ABC
        ArrayList<ClienteABC> clientesABC = new ArrayList<>();
        clientesABC.add(new ClienteABC(1, "Ana", "Rua A", "99999-1111", "Centro", "111.111.111-11", "MG123456"));

        // Clientes XYZ
        ArrayList<ClienteXYZ> clientesXYZ = new ArrayList<>();
        clientesXYZ.add(new ClienteXYZ(2, "Carlos", "Rua B", "Bairro B", "222.222.222-22", "88888-2222"));

        // Produtos ABC
        ArrayList<ProdutoABC> produtosABC = new ArrayList<>();
        produtosABC.add(new ProdutoABC(1, "Café", "Alimento", 10.5, "kg", 100));

        // Produtos XYZ
        ArrayList<ProdutoXYZ> produtosXYZ = new ArrayList<>();
        produtosXYZ.add(new ProdutoXYZ(2, "Açúcar", "Alimento", 4.0, 6.5, "kg", 50));

        // Exibir dados antes da fusão
        System.out.println("=== ANTES DA FUSÃO ===");
        System.out.println("Clientes ABC:");
        for (ClienteABC c : clientesABC) System.out.println(c);

        System.out.println("\nClientes XYZ:");
        for (ClienteXYZ c : clientesXYZ) System.out.println(c);

        System.out.println("\nProdutos ABC:");
        for (ProdutoABC p : produtosABC) System.out.println(p);

        System.out.println("\nProdutos XYZ:");
        for (ProdutoXYZ p : produtosXYZ) System.out.println(p);

        // Realizar fusão de clientes
        ArrayList<ClienteUnificado> clientesFusao = new ArrayList<>();
        for (ClienteABC c : clientesABC) {
            clientesFusao.add(new ClienteUnificado(c.codigo, c.nome, c.endereco, c.telefone, c.bairro, c.cpf, c.rg));
        }
        for (ClienteXYZ c : clientesXYZ) {
            clientesFusao.add(new ClienteUnificado(c.codigo, c.nome, c.endereco, c.fone, c.bairro, c.cpf, null));
        }

        // Realizar fusão de produtos
        ArrayList<ProdutoUnificado> produtosFusao = new ArrayList<>();
        for (ProdutoABC p : produtosABC) {
            produtosFusao.add(new ProdutoUnificado(p.codigo, p.nome, p.grupo, p.precoVenda, p.unidade, p.qtdEstoque));
        }
        for (ProdutoXYZ p : produtosXYZ) {
            produtosFusao.add(new ProdutoUnificado(p.codigo, p.nome, p.grupo, p.precoVenda, p.unidade, p.qtdEstoque));
        }

        // Exibir dados após fusão
        System.out.println("\n=== DEPOIS DA FUSÃO ===");
        System.out.println("Clientes unificados:");
        for (ClienteUnificado c : clientesFusao) System.out.println(c);

        System.out.println("\nProdutos unificados:");
        for (ProdutoUnificado p : produtosFusao) System.out.println(p);
    }
}

