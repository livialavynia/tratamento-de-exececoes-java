package br.ufal.aracomp.transacoesBancarias;

public class ContaCorrente extends Conta{

	private float limiteEspecial;
	
	public ContaCorrente(int numero, float saldo, String senha, float limiteEspecial) {
		super(numero, saldo, senha);
		this.limiteEspecial = limiteEspecial;
	}

	public float getLimiteEspecial() {
		return limiteEspecial;
	}
	
	public void setLimiteEspecial(float limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public void sacar(String senha, float valor) {
		this.saldo -= valor;
	}
}
