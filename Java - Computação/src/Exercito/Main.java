package Exercito;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String nome;
		String arma;
		int distancia;
		nome=JOptionPane.showInputDialog("Digite o nome do soldado 1:");
		Soldado Soldado1 = new Soldado(nome);
		nome=JOptionPane.showInputDialog("Digite o nome do soldado 2:");
		Soldado Soldado2 = new Soldado(nome);
		nome=JOptionPane.showInputDialog("Digite o nome do soldado 3:");
		Soldado Soldado3 = new Soldado(nome);
		nome=JOptionPane.showInputDialog("Digite o nome do soldado 4:");
		Soldado Soldado4 = new Soldado(nome);
		nome=JOptionPane.showInputDialog("Digite o nome do soldado 5:");
		Soldado Soldado5 = new Soldado(nome);
		
		int op=0;
		 
		for(;;) {
			 op=Integer.parseInt(JOptionPane.showInputDialog("Contagem de Soldados: "+Soldado.contagemSoldados
			 		+ "\n\nMenu:"
			 		+ "\n1 - Atacar"
			 		+ "\n2 - Movimentar"
			 		+ "\n3 - Sair"));
			 
			 if(op==3) {
				 JOptionPane.showMessageDialog(null, "Encerrando...");
				 break;
			 }
			 else if(op==1) {
				 op=Integer.parseInt(JOptionPane.showInputDialog("Escolha como deseja atacar: "
					 		+ "\n1 - Fuzil"
					 		+ "\n2 - Baioneta"
					 		+ "\n3 - Punho"));
				 if(op==1) {
					 arma="fuzil";
					 Soldado1.setArma(arma);
				 }
				 else if(op==1) {
					 arma="baioneta";
					 Soldado1.setArma(arma);
				 }
				 else if(op==3) {
					 arma="punho";
					 Soldado1.setArma(arma);
				 }
				 else {
					 arma="fuzil";
					 Soldado1.setArma(arma);
				 }
				 
				 if(Soldado1.atacar()) {
					 JOptionPane.showMessageDialog(null, "Ataque bem sucedido!\n"
					 		+ "Causou "+Soldado1.getDano()+" de dano!\n");
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "Poucos soldados disponíveis para o ataque, recrute mais!");
				 }
			 }
			 else if(op==2) {
				 distancia=Integer.parseInt(JOptionPane.showInputDialog("Distância que deseja percorrer: "));
				 
				 Soldado1.setDistancia(distancia);
				 Soldado1.movimentar(distancia);
				 
				 JOptionPane.showMessageDialog(null, "Distância percorrida: "+Soldado1.getDistancia()+"m"
				 		+ "\nPosição atual: "+Soldado1.getPosicao());
			 }
		}
	}
}
