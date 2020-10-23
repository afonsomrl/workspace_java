import java.util.ArrayList;

public class EmpregadoTeste {
	public static void main(String[] args) {
/*
		Empregado e1,e2,e3;
		
		e1 = new Empregado("Nome","Cargo",2000);
		e2 = new Empregado("Empregado sem salario","Cargo");
		e3 = new Empregado("Empregado sem cargo",1000);
		*/
		/*
		e1.setNome("Nome");
		e1.setCargo("Cargo");
		e1.setSalario(2000);
		*/
		/*
		e1.imprimir();
		e1.aumentarSalario(10);
		e1.imprimir();
		
		e2.imprimir();
				
		e3.imprimir();
		
*/
		
		ArrayList<Empregado> lista;
		
		lista = new ArrayList<Empregado>();
		
		lista.add(new Empregado("Jose", "Presidente", 10000));
		lista.add(new Empregado("Maria", "Vice Presidente", 9000));
		lista.add(new Empregado("Joao", "Coordenador", 7000));
		
		for (int pos=0;pos<lista.size();pos++) {
			lista.get(pos).imprimir();	
		}
		/*for (int pos=0;pos<lista.size();pos++) {
			lista.get(pos).aumentarSalario(10);
			lista.get(pos).imprimir();	
		}
		*/
		for (Empregado e:lista) {
			e.aumentarSalario(10);
			e.imprimir();	
		}
	}
}
