package com.company;

public class Produto {

    private String nome;
    private float preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() == 0) {
            System.out.println("Nome não pode ser vazio");
        } else {
            this.nome = nome;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco <= 0) {
            System.out.println("Preço tem que ser maior que zero");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque <= 0) {
            System.out.println("tem que ser maior que zero");
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
}
