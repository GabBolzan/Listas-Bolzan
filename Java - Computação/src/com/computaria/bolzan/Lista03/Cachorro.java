package com.computaria.bolzan.Lista03;

public class Cachorro {
	private String nome;
	private String raca;
	private boolean dormindo;
	
	public Cachorro(String raca) {
		this.raca=raca;
		this.nome="";
		this.dormindo=false;
	}
	
	public void acordar() {
		this.dormindo=false;
		System.out.println("O cachorro está acordando!");
	}
	
	public void dormir() {
		this.dormindo=true;
		System.out.println("O cachorro está dormindo!");
	}
	
	public void correr() {
		if(!dormindo) {
			System.out.println("\nO(a) "+nome+" está correndo!\n");			
		}
		else {
			System.out.println("\nO(a) "+nome+" está dormindo!");
		}
	}
	
	public void latir() {
		if(!dormindo) {
			System.out.println("\nO(a) "+nome+" está latindo\n");			
		}
		else {
			System.out.println("\nO(a) "+nome+" está dormindo!");
		}
	}
	
	public void roncar() {
		if(dormindo) {
			System.out.println("\nO(a) "+nome+" parece uma motoserra");		
		}
		else {
			System.out.println("\nO(a) "+nome+" não está dormindo!");
		}
	}
	
	public void setNome(String novoNome) {
		this.nome=novoNome;
	}
	
	public String getNome(String novoNome) {
		return this.nome=novoNome;
	}
	
	public String getRaca() {
		return this.raca;
	}

}
