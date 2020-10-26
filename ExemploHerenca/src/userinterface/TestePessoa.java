package userinterface;
import core.Estudante;
import core.Pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Isidro");
		p1.setEmail("isidro@isidro");
		p1.setTelefone("987654");
		
		Estudante e1 = new Estudante();
		e1.setCurso("Computacao");
		e1.setNumeroMatricula(123);
		e1.setNome("Jose");
		e1.setEmail("jose@jose");
		e1.setTelefone("986543");
		
		p1.exibirInfo();
		e1.exibirInfo();
	}
}
