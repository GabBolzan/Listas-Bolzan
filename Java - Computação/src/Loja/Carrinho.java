package Loja;

import java.util.ArrayList;

public class Carrinho {
	private ArrayList<ItemCompra> carrinho;
	public Carrinho() {
		this.carrinho=new ArrayList<>();
	}
	
	public void InserirItemCOmpra(Produto p) {
		ItemCompra item = new ItemCompra(p);
		this.carrinho.add(item);
	}
	
	/*public void removerItemCompra() {
		this.carrinho.remove();
	}*/
	
	public void imprimirCarrinho() {
		for (ItemCompra itemCompra : carrinho) {
			System.out.println(itemCompra);
		}
	}
}
