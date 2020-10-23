import java.util.Scanner;
import javax.swing.JOptionPane;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		String entrada;
		double valor;		
		ContaBancaria c1,c2;
		
		c1= new ContaBancaria("cpf","nome",123,456,7,1000);
		c2= new ContaBancaria("cpf2","nome2",890,123,4);
		
		do {
			//System.out.println("Digite 1- Deposito / 2- Saque / 3- Info / -1 - Sair ");
			//opcao =teclado.nextInt();
			
			entrada = JOptionPane.showInputDialog("Digite 1- Deposito / 2- Saque / 3- Info / -1 - Sair ");
			opcao = Integer.parseInt(entrada);
			switch(opcao) {
			case 1:
				//System.out.println("Digite o valor a depositar:");
				//valor =teclado.nextDouble();
				entrada = JOptionPane.showInputDialog("Digite o valor a depositar:");
				valor = Double.parseDouble(entrada);
				c1.depositar(valor);
				break;
			case 2:
				//System.out.println("Digite o valor que a sacar:");
				//valor =teclado.nextDouble();
				entrada = JOptionPane.showInputDialog("Digite o valor a sacar:");
				valor = Double.parseDouble(entrada);
				boolean res = c1.sacar(valor);
				if(res) {
					//System.out.println("Saque Autorizado!");
					JOptionPane.showMessageDialog(null, "Saque Autorizado");
				}
				else {
					//System.out.println("Saque Nao Autorizado!");
					JOptionPane.showMessageDialog(null, "Saque Nao Autorizado");
				}
				break;
			case 3:
				//c1.imprimir();
				//System.out.println(c1.exibirInfo());
				JOptionPane.showMessageDialog(null, c1.exibirInfo());
				break;
			case -1:
				//System.out.println("Obrigado");
				JOptionPane.showMessageDialog(null, "Obrigado");
				break;
			default:
				//System.out.println("Opção invalida");
				JOptionPane.showMessageDialog(null, "Opcao invalida");
			}
		}while(opcao!=-1);	
	}
}
		//c1.imprimir();
		//c2.imprimir();
		
		//c1.depositar(100);
		//c1.imprimir();
		//c1.sacar(10);
		//c1.imprimir();
		
		//c2.sacar(10);
		

