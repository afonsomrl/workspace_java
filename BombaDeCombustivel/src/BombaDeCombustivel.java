
public class BombaDeCombustivel {
	private String nome;
	private double precoLitro;
	private double qtdLitros;
	private double totalPagar;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdLitros() {
		return qtdLitros;
	}
	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	public BombaDeCombustivel(String nome, double precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
	public String exibirRecibo(){
		String recibo;
		recibo = nome+" R$"+precoLitro+"/l Qtd litros: "+String.format("%.2f", qtdLitros)+"l Total a Pagar: R$"+totalPagar;
		return recibo;
	}
	
	public void abastecerPorLitros(double litros) {
		qtdLitros = litros;
		totalPagar= precoLitro*litros;
	}
	
	public void abastecerPorValor(double valor) {
		totalPagar = valor;
		qtdLitros = valor/precoLitro;
	}
}
