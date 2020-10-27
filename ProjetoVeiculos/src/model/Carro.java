package model;

public class Carro extends Veiculo {
	private String modelo;

	public Carro(String marca, String placa, String modelo) {
		super(marca, placa);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void acelerar() {
		System.out.println("Carro "+modelo+" acelera no pé");
	}
	public void frear() {
		System.out.println("Carro "+modelo+" freia na mão");
	}
}
