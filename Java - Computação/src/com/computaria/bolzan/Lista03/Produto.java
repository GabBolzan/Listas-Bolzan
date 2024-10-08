package com.computaria.bolzan.Lista03;

public class Produto {
	private String nome;
    private double valor;
    private int quantidadeEstoque;

    public Produto(String nome, double valor, int qtd){
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = qtd;
    }

    public Produto(String nome){
        this.nome = nome;
        this.quantidadeEstoque = 0;
        this.valor = 0;
    }

    public Produto(){
        this.nome = "";
        this.valor = 0;
        this.quantidadeEstoque = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValor(double valor) {
       this.valor = valor;
    }


    public void escreverDados(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Valor unitário: R$ " + this.valor);
        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
    }
    
    public double calcularValorTotal(){
        return this.valor*this.quantidadeEstoque;
    }

    public void alterarQuantidade(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
}
