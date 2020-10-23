
public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria c1,c2;
		
		c1= new ContaBancaria("cpf","nome",123,456,7,1000);
		c2= new ContaBancaria("cpf2","nome2",890,123,4);
		
		c1.imprimir();
		c2.imprimir();
		
		c1.depositar(100);
		c1.imprimir();
		c1.sacar(10);
		c1.imprimir();
		
		c2.sacar(10);
		
	}
}
