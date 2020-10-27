package model;

public class Horista extends Funcionario{
	private double valorHora;
	private int numeroHoras;
	
	public Horista(String nome, int numRegistro, double valorHora, int numeroHoras) {
		super(nome, numRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	public double calcularSalario() {
		return valorHora*numeroHoras;
	}
}
