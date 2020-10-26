package core;
public class Estudante extends Pessoa{
	private String curso;
	private int numeroMatricula;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public void exibirInfo() {
		System.out.println("Nome "+nome+" / "+email+" ("+telefone+") "+numeroMatricula+"/"+curso);
	}
	
}
