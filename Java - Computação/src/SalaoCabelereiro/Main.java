package SalaoCabelereiro;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Salao salao = new Salao();
		int op;
		String nome;
		String sexo;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
					+ "1 - Adicionar cliente a fila\n"
					+ "2 - Atender cliente\n"
					+ "3 - Listar fila\n"
					+ "4 - Sair"));
			
			if(op==4) {
				JOptionPane.showMessageDialog(null, "Saindo...");
				break;
			}
			else if(op==1) {
				if(salao.isCheio()) {
					JOptionPane.showMessageDialog(null, "O salão está cheio!!!");
				}
				else {
					nome=JOptionPane.showInputDialog("Nome:");
					sexo=JOptionPane.showInputDialog("Sexo:");
					salao.cadastrarCliente(nome, sexo);
				}
			}
			else if(op==2) {
				if(salao.isVazio()) {
					JOptionPane.showMessageDialog(null, "O salão está vazio!!!");
				}
				else {
					Cliente cliente=salao.chamarProximo();
                    JOptionPane.showMessageDialog(null, "Atendendo cliente: "+cliente.getNome()+"\n"
                    		+ "Sexo: "+cliente.getSexo());
				}
			}
			else if(op==3) {
				if(salao.isVazio()) {
					JOptionPane.showMessageDialog(null, "O salão está vazio!!!");
				}
				else {
					StringBuilder filaClientes = new StringBuilder("Clientes na fila:\n");
                    for (int i = 0; i < salao.proximo; i++) {
                        filaClientes.append((i + 1)+". "+salao.fila[i].getNome()+"\n");
                    }
                    JOptionPane.showMessageDialog(null, filaClientes.toString());
				}
			}
			else {
				JOptionPane.showInternalMessageDialog(null, "Digite uma opção válida!!!");
			}
		}
	}
}
