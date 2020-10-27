package userinterface;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Estacionamento {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro("Volkswagem","ABC1234","Fusca");
		v2 = new Moto("Yamaha","XYZ9876","Speed");
		
		v1.acelerar();
		v2.acelerar();
		
		v1.frear();
		v2.frear();
	}
}
