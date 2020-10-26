package model;

public class Cliente {
	protected String nome;
	protected String email;
	protected double linhaCredito;
	protected double valorFatura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getLinhaCredito() {
		return linhaCredito;
	}
	public void setLinhaCredito(double linhaCredito) {
		this.linhaCredito = linhaCredito;
	}
	public double getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	
	public Cliente(String nome, String email, double linhaCredito) {
		super();
		this.nome = nome;
		this.email = email;
		this.linhaCredito = linhaCredito;
		this.valorFatura = 0;
	}
	
	public String exibirFatura() {
		return "Cliente: "+nome+"\ne-mail: "+email+"\nLinha de Credito R$:"+linhaCredito+"\nO Total da Fatura é R$:"+valorFatura+"\n";
	}
	
	public void pagarFatura(double valor) {
		this.valorFatura-=valor;
	}
	
	public boolean comprar(double valor) {
		if (this.valorFatura+valor<=this.linhaCredito) {
			this.valorFatura+=valor;
			return true;
		}
		else {
			return false;
		}
	}
}
