
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1,e2,e3;
		
		e1 = new Empregado("Nome","Cargo",2000);
		e2 = new Empregado("Empregado sem salario","Cargo");
		e3 = new Empregado("Empregado sem cargo",1000);
		
		/*
		e1.setNome("Nome");
		e1.setCargo("Cargo");
		e1.setSalario(2000);
		*/
		
		e1.imprimir();
		e1.aumentarSalario(10);
		e1.imprimir();
		
		e2.imprimir();
				
		e3.imprimir();
		
	}
}
