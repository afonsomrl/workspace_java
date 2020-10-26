package model;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	public Conta(String nomeTitular, String cpf, int numeroConta, float saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public boolean debitar(float valor) {
		if(valor<=saldo) {
			saldo = saldo-valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void creditar(float valor) {
		this.saldo+=valor; 
	}
	
	public String toString() {
		String resultado;
		resultado = "Nome: "+nomeTitular+" CPF: "+cpf+"\n"+
		             "Conta: "+numeroConta+" Saldo: "+saldo+"\n";
		return resultado;		
	}
	
}
