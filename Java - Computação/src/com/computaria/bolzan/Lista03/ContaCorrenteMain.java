package com.computaria.bolzan.Lista03;

public class ContaCorrenteMain {
	public static void main(String[] args) {
        String nome = "Fábio";//digite seu nome
        String cpf = "025242343-54";
        String email = "fabio.pinheiro@ifc.edu.br";
        String senha = "fabio123";

        ContaCorrente cc1 = new ContaCorrente(nome, cpf, email, senha);
        //inserir cc1 no banco de dados
        nome = "Bolzan";
        cpf = "666566055-33";
        email = "bolzan@ifc.edu.br";
        senha = "varela";

        ContaCorrente cc2 = new ContaCorrente(nome, cpf, email, senha);


        cc1.depositar(100);
        if (cc1.sacar(50))
            System.out.println("Retire seu dinheiro!");
        else
            System.out.println("Saldo insuficiente");
        System.out.println(cc1);


        cc2.depositar(20000);
        System.out.println(cc2);
        cc2.sacar(15);
        System.out.println(cc2);

        if (cc2.transferir(3, cc1))
            System.out.println("Deu certo! "+cc1.getNome()+" agradece!");
        else
            System.out.println("Saldo insuficiente.");
        
        
        System.out.println(cc1);
        System.out.println(cc2);

    }
}
