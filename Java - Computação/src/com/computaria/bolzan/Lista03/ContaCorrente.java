package com.computaria.bolzan.Lista03;

import java.util.Random;

public class ContaCorrente {
	private String nome;
    private String cpf;
    private String email;
    private String cc;
    private String agencia;
    private String senha;
    private double saldo;

    public ContaCorrente(String nome, String cpf, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.saldo = 0;
        this.agencia = "123";
        this.cc = gerarNumeroCC();
    }
    
    private String gerarNumeroCC(){
        Random r = new Random();
        int contaInteiro = r.nextInt(9999);
        return Integer.toString(contaInteiro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCc() {
        return cc;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0)
            this.saldo += valor;
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= this.getSaldo()){
            this.saldo -= valor;
            return true;
        }else
            return false;
    }

    public boolean transferir(double valor, ContaCorrente fulano){
        if (this.sacar(valor)){
            fulano.depositar(valor);
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        String dados = "Nome: " + this.nome + 
                    "\nEmail: " + this.email +
                    "\nSaldo: " + this.saldo;
        return dados;
    }
}
