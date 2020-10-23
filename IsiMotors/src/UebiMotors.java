
public class UebiMotors {
	public static void main(String[] args) {
		
		carro c1, c2;
		
		c1 = new carro();
		c2 = new carro();
		
		c1.setMarca("Porsche");
		c1.setModelo("Cayenne");
		c1.setCor("Prata chumbo");
		c1.setAno(2020);
		c1.setPreco(1350000);
		
		c2.setMarca("Chevrolet");
		c2.setModelo("Corsa");
		c2.setCor("Prata");
		c2.setAno(1996);
		c2.setPreco(6200);
		
		c1.exibirAnuncio();
		double ipvaC1= c1.calcularIPVA();
		System.out.println("Valor do IPVA R$"+ipvaC1);
		double parcelaC1 = c1.calcularParcelaFinanciamento(60);
		System.out.println("Parcela para financiamento 60x R$"+parcelaC1);
		
		
		c2.exibirAnuncio();		
		double ipvaC2= c2.calcularIPVA();
		System.out.println("Valor do IPVA R$"+ipvaC2);
		double parcelaC2 = c2.calcularParcelaFinanciamento(18);
		System.out.println("Parcela para financiamento 18x R$"+parcelaC2);
		
		
	}
}
