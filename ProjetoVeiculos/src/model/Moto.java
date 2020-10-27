package model;

public class Moto extends Veiculo{
	private String tipo;

	public Moto(String marca, String placa, String tipo) {
		super(marca, placa);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void acelerar() {
		System.out.println("Moto "+tipo+" acelera na mão");
	}
	public void frear() {
		System.out.println("Moto "+tipo+" freia no pé");
	}
}
