package userinterface;
import java.util.ArrayList;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class TesteCartao {
	public static void main(String[] args) {
		/*
		CartaoPrePago c1 = new CartaoPrePago("1111 2222 3333 4444","Nome",2030,10,1000);
		
		System.out.println(c1);
		if(c1.comprar(100)){
			System.out.println("Compra autorizado\n");
		}
		else {
			System.out.println("Compra não autorizada. Saldo Insuficiente\n");
		}
		System.out.println(c1);
		
		CartaoCashBack b1 = new CartaoCashBack("3333 4444 5555 6666 ","Cliente Gold",2030,10,1000,0);
		CartaoCashBack b2 = new CartaoCashBack("3333 5555 6666 7777 ","Cliente Silver",2030,10,1000,1);
		CartaoCashBack b3 = new CartaoCashBack("3333 6666 7777 8888 ","Cliente Bronze",2030,10,1000,2);
		
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		c1.comprar(100);
		b1.comprar(100);
		b2.comprar(100);		
		b3.comprar(100);
		
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		*/
		
		ArrayList<CartaoPrePago> cartoes;
		cartoes = new ArrayList<CartaoPrePago>();
		cartoes.add(new CartaoPrePago("1111 2222 3333 4444","Nome",2030,10,1000));
		cartoes.add(new CartaoCashBack("3333 4444 5555 6666 ","Cliente Gold",2030,10,1000,0));
		cartoes.add(new CartaoCashBack("3333 5555 6666 7777 ","Cliente Silver",2030,10,1000,1));
		cartoes.add(new CartaoCashBack("3333 6666 7777 8888 ","Cliente Bronze",2030,10,1000,2));
		
		
		for (CartaoPrePago c: cartoes) {
			System.out.println(c);
		}
		for (CartaoPrePago c: cartoes) {
			c.comprar(100);
			System.out.println(c);
		}
		
	}
}
