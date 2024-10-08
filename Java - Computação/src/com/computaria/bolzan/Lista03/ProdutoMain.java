package com.computaria.bolzan.Lista03;

public class ProdutoMain {
	public static void main(String[] args) {       
        Produto p1 = new Produto();
        Produto p2 = new Produto("Teclado Gamer", 400, 8);
        Produto p3 = new Produto("Corda");        

        
        p1.setNome("Mouse");
        p1.setValor(40);
        p1.alterarQuantidade(35);

        p1.escreverDados();        

        p1.setNome("Mouse gamer");
        p1.setValor(290);
        p1.alterarQuantidade(5000);
        

        p1.escreverDados();
        p2.escreverDados();
        p3.escreverDados();
    }
}
