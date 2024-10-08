package SalaoCabelereiro;

public class Salao {

	public Cliente[] fila;
	public int proximo;

	public Salao() {
		this.fila = new Cliente[10];
		this.proximo=0;
	}
	
	public boolean cadastrarCliente(String nome, String sexo) {
		if(!isCheio()) {
			Cliente cliente = new Cliente(nome, sexo);
			this.fila[this.proximo]=cliente;
			this.proximo++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isCheio() {
		 return this.proximo+1>=this.fila.length;
	}
	
	public boolean isVazio() {
		return this.proximo==0;
	}
	
	private void atualizarFila() {
		for(int i=0; i<this.proximo-1; i++) {
			this.fila[i]=this.fila[i+1];
		}
		
		this.fila[this.proximo]=null;
		
		this.proximo--;
	}
	
	public Cliente chamarProximo() {
		Cliente clienteAtendido=null;
		
		if(!isVazio()) {
			clienteAtendido=this.fila[0];
			atualizarFila();
		}
		
		return clienteAtendido;
	}
}
