
public class Sistema {
	public static void main(String[] args) {
		
		Livro l1, l2;
		
		l1 = new Livro();
		l2 = new Livro();
		
		
		l1.setTitulo("Titulo");
		l1.setAutor("Autor");
		l1.setAno(2020);
		l1.setCategoria("Categoria");
		l1.setNumeroEstante(1);
		l1.setNumeroPrateleira(1);
		l1.emprestar();
		
		l2.setTitulo("Titulo");
		l2.setAutor("Autor");
		l2.setAno(2020);
		l2.setCategoria("Categoria");
		l2.setNumeroEstante(1);
		l2.setNumeroPrateleira(2);
		l2.devolver();
		
		l1.exibirLivro();
		l2.exibirLivro();
		
	}
}
