
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1;
		
		e1 = new Empregado();
		
		e1.setNome("Nome");
		e1.setCargo("Cargo");
		e1.setSalario(2000);
		
		e1.imprimir();
		e1.aumentarSalario(10);
		e1.imprimir();
	}
}
