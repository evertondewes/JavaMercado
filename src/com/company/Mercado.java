package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {
    public ArrayList<Produto> alProdutos = new ArrayList<Produto>();

    public ArrayList<Item> alItem = new ArrayList<Item>();

    public static void main(String[] args) {

        Mercado m = new Mercado();
        m.inicializarMercado();

        Scanner s = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Entre com a opcao:");
            System.out.println("0 - Sair");
            System.out.println("1 - Venda");
            System.out.println("2 - Cadastro Produto");
            System.out.println("3 - Listar Vendas");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Entre com o produto");
                    String nomeProduto = s.nextLine();

                    Produto pEncontrado = null;

                    for(int i=0; i < m.alProdutos.size(); i++){
                        if(m.alProdutos.get(i).getNome().equals(nomeProduto)){
                            pEncontrado = m.alProdutos.get(i);
                        }
                    }

                    if(pEncontrado==null) {
                        System.out.println("Produto não encontrado");
                    } else {
                        System.out.println("Informe a quantidade");

                        Item i = new Item();
                        i.quantidade = s.nextInt();
                        s.nextLine();
                        i.p = pEncontrado;

                        m.alItem.add(i);
                    }

                    break;
                case 2:
                    break;
                case 3:
                    for (Item i: m.alItem) {
                        System.out.println("Lista de vendas:");
                        System.out.println("Item: " + i.p.getNome()
                                + ", quantidade:" + i.quantidade);
                    }
                    break;
                default:
                    System.out.println("Adeus Amiguinho");
            }

        } while (opcao != 0);

    }

    public void inicializarMercado() {
        Produto p = new Produto();
        p.setNome("Cebola");
        p.setPreco(123.4f);
        p.setQuantidadeEstoque(123);

        this.alProdutos.add(p);

        p = new Produto();
        p.setNome("Tomate");
        p.setPreco(1.4f);
        p.setQuantidadeEstoque(23);

        this.alProdutos.add(p);

        p = new Produto();
        p.setNome("Alface");
        p.setPreco(10.4f);
        p.setQuantidadeEstoque(12);

        this.alProdutos.add(p);
    }
}
