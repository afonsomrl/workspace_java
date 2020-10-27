package model;

public abstract class Veiculo {
	protected String marca;
	protected String placa;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Veiculo(String marca, String placa) {
		super();
		this.marca = marca;
		this.placa = placa;
	}
	
	public abstract void acelerar();
	public abstract void frear();
	
}
