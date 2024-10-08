package com.computaria.bolzan.Lista03;

public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jose", 'M', 1979);
		
		int idade = p1.calcularIdade(2024);
		System.out.println("Sua idade atual é: "+idade);
		
		p1.cumprimentar();
	}

}
