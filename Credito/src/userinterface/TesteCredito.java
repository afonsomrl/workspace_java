package userinterface;

import java.util.ArrayList;

import model.Cliente;
import model.ClienteFiel;

public class TesteCredito {
	public static void main(String[] args) {
		ArrayList <Cliente> clientes;
		clientes = new ArrayList<Cliente>();
		
		clientes.add(new Cliente("Joao","joao@joao",1000));
		clientes.add(new Cliente("Jose","jose@jose",2000));
		clientes.add(new ClienteFiel("Jose Fiel","jose@jose",2000, 5));
		
		for (Cliente c: clientes) {
			if(c.comprar(1500)){
				System.out.println("Compra realizada para o Cliente: "+c.getNome());
				
			}
			else {
				System.out.println("Sem limite de Credito para o Cliente: "+c.getNome());
			}
		}
		
		for(Cliente c: clientes) {
			System.out.println(c.exibirFatura());
		}
	
		
		
	}
}
