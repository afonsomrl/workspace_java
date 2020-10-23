
public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private String categoria;
	private int numeroEstante;
	private int numeroPrateleira;
	private boolean emprestado;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor(String novoAutor) {
		autor = novoAutor;
	}
	public String getAutor() {
		return autor;
	}
	public void setAno(int novoAno) {
		ano = novoAno;
	}
	public int getAno() {
		return ano;
	}
	public void setCategoria(String novaCategoria) {
		categoria = novaCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setNumeroEstante(int novoNumeroEstante) {
		numeroEstante = novoNumeroEstante;
	}
	public int getNumeroEstante() {
		return numeroEstante;
	}
	public void setNumeroPrateleira(int novoNumeroPrateleira) {
		numeroPrateleira = novoNumeroPrateleira;
	}
	public int getNumeroPrateleira() {
		return numeroPrateleira;
	}
	public void emprestar() {
		emprestado = true;
	}
	public void devolver() {
		emprestado = false;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	
	public void exibirLivro(){
		System.out.println("----------------------------------");
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Ano: "+ano);
		System.out.println("Categoria: "+categoria);
		System.out.println("Estante: "+numeroEstante+" Prateleira: "+numeroPrateleira);
		if(emprestado) {
			System.out.println("Livro Emprestado");
		}
		else {
			System.out.println("Livro Disponivel");
		}
		System.out.println("----------------------------------");
	}
	
}	
