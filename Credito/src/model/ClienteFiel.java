package model;

public class ClienteFiel extends Cliente{
	private double descontoCompra;
	
	
	public ClienteFiel(String nome, String email, double linhaCredito, double descontoCompra) {
		super(nome, email, linhaCredito);
		this.descontoCompra = descontoCompra;
	}

	public double getDescontoCompra() {
		return descontoCompra;
	}

	public void setDescontoCompra(double descontoCompra) {
		this.descontoCompra = descontoCompra;
	}

	public boolean comprar(double valor) {
		double novoValor =valor -valor*descontoCompra/100;
		
		if(super.valorFatura +novoValor>super.linhaCredito) {
			return false;
		}
		else {
			super.valorFatura+=novoValor;
			return true;
		}
		//return super.compra(novoValor);
	}
}
