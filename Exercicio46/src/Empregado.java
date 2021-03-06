
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	
	public Empregado(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Empregado(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = 0.0;
	}
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.cargo = "A definir";
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimir(){
		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Salario: R$"+salario);
		System.out.println("---------------------");
	}
	
	public void aumentarSalario(double percentual) {
		salario = salario*(1+(percentual/100));
	}
	
}
