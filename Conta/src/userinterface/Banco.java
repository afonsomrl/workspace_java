package userinterface;
import model.Conta;
import model.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		Conta c1 = new Conta("Nome","cpf",1234,1000);
		//c1.setNomeTitular("Nome");
		//c1.setCpf("cpf");
		//c1.setNumeroConta(1234);
		//c1.creditar(1000);
		
		System.out.println(c1.toString());
		if(c1.debitar(350)){
			System.out.println("Saque autorizado\n");
		}
		else {
			System.out.println("Saldo insuficiente\n");
		}
		System.out.println(c1.toString());
		
		ContaEspecial e1 = new ContaEspecial("Nome","cpf",5678,300,500);
		//e1.setNomeTitular("Nome");
		//e1.setCpf("cpf");
		//e1.setNumeroConta(5678);
		//e1.setLimite(500);
		//e1.creditar(300);
		
		System.out.println(e1.toString());
		if(e1.debitar(430)){
			System.out.println("Debito autorizado\n");
		}
		else {
			System.out.println("Debito não autorizado\n");
		}
		System.out.println(e1.toString());
	}
}
