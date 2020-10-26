package model;

public class CartaoCashBack extends CartaoPrePago{
	private int tipo;
	
	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "CartaoCashBack [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}
	
	public boolean comprar(double valor) {
		if (valor<=super.saldo) {
			super.saldo-=valor;
			if (tipo==0) { //Gold
				super.saldo = super.saldo+valor*0.08;
			}
			if (tipo==1) { //Silver
				super.saldo = super.saldo+valor*0.05;
			}
			if (tipo==2) { //Bronze
				super.saldo = super.saldo+valor*0.02;
			}			
			return true;
		}
		else {
			return false;
		}
	}
}
