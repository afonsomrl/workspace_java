
public class carro {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private double preco;

	// aqui criamos um método:
	// é um trecho de código que faz uma tarefa específica
	// todo método pode receber entrada de dados e tbm retornar alguns resultados
	
	void setMarca(String novaMarca) {
		marca = novaMarca;
	}
	String getMarca() {
		return marca;
	}
	void setModelo(String novoModelo) {
		modelo = novoModelo;
	}
	String getModelo() {
		return modelo;
	}
	void setCor(String novaCor) {
		cor = novaCor;
	}
	String getCor() {
		return cor;
	}
	void setAno(int novoAno) {
		ano = novoAno;
	}
	int getAno() {
		return ano;
	}
	void setPreco(double novoPreco) {
		preco = novoPreco;
	}
	double getPreco() {
		return preco;
	}
	
	
	void exibirAnuncio(){
		
		// vou fazer vários PRINT das informações armazenadas nos atributos
		
		System.out.println("Anuncio carro: "+marca+" "+modelo);
		System.out.println("Cor: "+cor);
		System.out.println("Ano: "+ano+" Preço: "+preco);
		
	}
	
	double calcularIPVA(){
		double valorIPVA;
		if(ano<=2000){
			valorIPVA =0;
		}
		else {
			valorIPVA = preco*0.04;
		}
		return valorIPVA;
	}
	
	double calcularParcelaFinanciamento(int numeroParcelas) {
		double valorParcela;
		valorParcela = (preco+(preco*0.4))/numeroParcelas;
		return valorParcela;
	}
	

}
