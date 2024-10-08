package com.computaria.bolzan.Lista03;

public class Pessoa {
	private String nome;
	private char genero;
	private int anoNasc;
	
	public Pessoa(String nome, char genero, int ano) {
		this.nome=nome;
		this.genero=genero;
		this.anoNasc=ano;
	}
	
	public void cumprimentar() {
		String pronomeTratamento;
		if(this.genero=='M') {
			pronomeTratamento="Sr. ";
		}
		else if(this.genero=='F') {
			pronomeTratamento="Srta. ";
		}
		else {
			pronomeTratamento="Prezado(a) ";
		}
		
		System.out.println(pronomeTratamento+this.nome+" seja bem-vindo(a)!");
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual-this.anoNasc;
	}

}
