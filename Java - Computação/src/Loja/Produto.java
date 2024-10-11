package Loja;

public class Produto {
	private int cod;
	private String nome;
	private double valor;
	
	public Produto(int c, String n,  double v) {
		this.cod=c;
		this.nome=n;
		this.valor=v;
	}

	public int getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.cod+" - "+this.nome+" - R$"+this.valor;
	}
}
