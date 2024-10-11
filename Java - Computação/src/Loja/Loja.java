package Loja;

import java.util.ArrayList;

public class Loja {
		private ArrayList<Produto> produtos;
		
		public Loja() {
			this.produtos=new ArrayList<>();
		}
		
		public void adicionarProduto(int cod, String nome, double valor) {
			Produto p = new Produto(cod, nome, valor);
			this.produtos.add(p);
		}
		
		public void removerProduto(Produto p) {
			this.produtos.remove(p);
		}

		public ArrayList<Produto> getProdutos() {
			return produtos;
		}

		public Produto getProduto(int i) {
			return this.produtos.get(i);
		}
		
		
}
