
public class ContaBancaria {
	private String cpfTitular;
	private String nome;
	private int agencia;
	private int conta;
	private int dv;
	private double saldo;
	
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaBancaria(String cpfTitular,String nome,int agencia, int conta, int dv){
		this.cpfTitular = cpfTitular;
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.dv = dv;
		this.saldo = 0;
	}
	public ContaBancaria(String cpfTitular,String nome,int agencia, int conta, int dv,double saldo){
		this.cpfTitular = cpfTitular;
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.dv = dv;
		this.saldo = saldo;
	}
	
	public void imprimir(){
		System.out.println("CPF: "+cpfTitular);
		System.out.println("Nome: "+nome);
		System.out.println("Agencia: "+agencia+" Conta: "+conta+"-"+dv);
		System.out.println("Saldo: "+saldo);
		System.out.println("---------------------");
	}
	
	public void depositar(double valor) {
		saldo = saldo +valor;
	}
	
	public boolean sacar(double valor) {
		if(valor<saldo) {
			return false;
		}
		else {
			saldo = saldo-valor;
			return true;
		}
	}
	
}
