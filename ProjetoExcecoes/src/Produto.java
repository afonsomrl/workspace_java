
public class Produto {
	private int id;
	private String descricao;
	private double preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id<=0) {
			throw new RuntimeException("ID nao pode ser negativo");
		}
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao ==null|| descricao.length()==0) {
			throw new RuntimeException("Descricao deve conter algum valor valido");
		}		
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco<0) {
			throw new RuntimeException("Preco invalido para o procuto");
		}
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
}
