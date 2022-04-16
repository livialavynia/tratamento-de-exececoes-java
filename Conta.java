package br.ufal.aracomp.transacoesBancarias;

public abstract class Conta {
	protected int numero;
	protected float saldo;
	protected String senha;
	
	public Conta(int numero, float saldo, String senha) {
		this.numero = numero;
		this.saldo = saldo;
		this.senha = senha;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
	public float getSaldo(String senha) {
		return saldo;
	}
	
	public void depositar(float valor) {
		this.saldo+=valor;
	}
	
	public void sacar(String senha, float valor) {
		this.saldo -= valor;
	}
	
	public boolean validarSenha(String senha) {
		return this.senha.equals(senha);
	}
	
	@Override
	public String toString() {
		String output = "Conta: " + this.numero;
		if(this instanceof Poupanca)
			output += " (POUPANCA)";
		else if(this instanceof ContaCorrente)
			output += " (CONTA CORRENTE)";
		return output;
	}
}
