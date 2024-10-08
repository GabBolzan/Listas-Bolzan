package com.computaria.bolzan.Lista03;

public class CachorroMain {
	public static void main(String[] args) {
		Cachorro tereza = new Cachorro("Pug");
		Cachorro mike = new Cachorro("Caroço de manga chupada");
		
		tereza.setNome("Tereza Pìnheiro");
		tereza.latir();
		
		System.out.println("Seja bem vindo(a) "+tereza.getNome(null)+" da raça "+tereza.getRaca());
	}

}
