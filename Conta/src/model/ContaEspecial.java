package model;
public class ContaEspecial extends Conta {
	private float limite;
	
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, float limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}
	
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public String toString() {
		String resultado;
		resultado = "Nome: "+super.nomeTitular+" CPF: "+super.cpf+"\n"+
		            "Conta: "+super.numeroConta+" Saldo: "+super.saldo+"\n"+
				    "Limite: "+this.limite+"\n";
		return resultado;		
	}
	
	public boolean debitar(float valor) {
		if(valor<=super.saldo+this.limite) {
			super.saldo = super.saldo-valor;
			return true;
		}
		else {
			return false;
		}
	}
	
}
