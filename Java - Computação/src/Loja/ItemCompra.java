package Loja;

public class ItemCompra {
	private Produto produto;
	private int quantidade;
	
	public ItemCompra(Produto p) {
		this.produto=p;
		this.quantidade=1;
	}
	public Produto getProdtuo() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void aumentarQuantidade() {
		this.quantidade++;
	}
	
	public void diminuirQuantidade() {
		this.quantidade--;
	}
	
	public void setQUantidade(int quantidade) {
		this.quantidade=quantidade;
	}
	
	@Override
	public String toString() {
		return this.produto+" - \nQuantidade:"+this.quantidade;
	}
}
