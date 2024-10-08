package Exercito;

import java.util.Random;

public class Soldado {
	private String nome;
	private String arma;
	private int posicao;
	public int distancia;
	public static int contagemSoldados=0;
	public static final int distanciaPadrao=5;
	public static final int tamanhoMinimoExercito=10;
	public boolean ataque=false;
	public int dano;
	
	public Soldado(String nome) {
		this.nome=nome;
		this.posicao=0;
		this.contagemSoldados++;
	}
	
	public void movimentar() {
		this.posicao+=distanciaPadrao;
	}
	
	public void movimentar(int distancia) {
		this.posicao+=distancia;
	}
	
	public boolean atacar() {
		Random r = new Random();
		if(contagemSoldados>tamanhoMinimoExercito) {
			return false;
		}
		else {
			do {
				if(arma=="fuzil") {
					this.dano=r.nextInt(90);
				}
				else if(arma=="baioneta") {
					this.dano=r.nextInt(45);
				}
				else if(arma=="punho") {
					this.dano=r.nextInt(10);
				}
				return true;
			}while(this.dano==0);
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getPosicao() {
		return this.posicao;
	}
	
	public int getDano() {
		return this.dano;
	}
	
	public void setArma(String arma) {
		this.arma=arma;
	}
	
	public void setDistancia(int distancia) {
		this.distancia=distancia;
	}
	
	public int getDistancia() {
		return distancia;
	}
}
