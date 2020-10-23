import javax.swing.JOptionPane;
import java.util.Scanner;

public class Bomba {
	public static void main(String[] args) {
		/*
		int opcao;
		String entrada;
		double valor;
		
		BombaDeCombustivel a;
		
		a = new BombaDeCombustivel("Gasolina",3.90);
		
		do {
			entrada = JOptionPane.showInputDialog("Digite 1- Abastecer por Litro / 2- Abatecer por Valor / 3- Sair ");
			opcao = Integer.parseInt(entrada);
			switch(opcao) {
			case 1:
				entrada = JOptionPane.showInputDialog("Digite a quantidade de Litros: ");
				valor = Double.parseDouble(entrada);
				a.abastecerPorLitros(valor);
				JOptionPane.showMessageDialog(null, a.exibirRecibo());
				break;
			case 2:
				entrada = JOptionPane.showInputDialog("Digite o valor R$:");
				valor = Double.parseDouble(entrada);
				a.abastecerPorValor(valor);
				JOptionPane.showMessageDialog(null, a.exibirRecibo());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Obrigado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida");
			}
		}while(opcao!=-1);	
		*/
		
		BombaDeCombustivel bombas[];
		
		bombas = new BombaDeCombustivel[5];
		
		bombas[0] = new BombaDeCombustivel("Gasolina Comum", 4.19);
		bombas[1] = new BombaDeCombustivel("Gasolina Adtivada", 4.39);
		bombas[2] = new BombaDeCombustivel("Gasolina Podium", 4.59);
		bombas[3] = new BombaDeCombustivel("Etanol", 2.49);
		bombas[4] = new BombaDeCombustivel("Diesel", 3.99);
		
		
		int opcao,modo;
		double valor;
		Scanner teclado = new Scanner(System.in);
		
		
		do {
			System.out.println("Escolha");
			for(int pos=0; pos<5;pos++) {
				System.out.println(+pos+ " "+bombas[pos].getNome()+" "+bombas[pos].getPrecoLitro());
			}
			opcao = teclado.nextInt();
			
			
			if(opcao==0) {
				System.out.println("1 para litos , 2 para valor");
				modo = teclado.nextInt();
				if(modo==1) {
					System.out.println("Quantos Litros?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo ==2) {
					System.out.println("Quantos Valor?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());					
				}
				else {
					System.out.println("Modo Invalido");
				}
			}
			else if(opcao==1) {
				System.out.println("1 para litos , 2 para valor");
				modo = teclado.nextInt();
				if(modo==1) {
					System.out.println("Quantos Litros?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo ==2) {
					System.out.println("Quantos Valor?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());					
				}
				else {
					System.out.println("Modo Invalido");
				}
			}
			else if(opcao==2) {
				System.out.println("1 para litos , 2 para valor");
				modo = teclado.nextInt();
				if(modo==1) {
					System.out.println("Quantos Litros?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo ==2) {
					System.out.println("Quantos Valor?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());					
				}
				else {
					System.out.println("Modo Invalido");
				}
			}
			else if(opcao==3) {
				System.out.println("1 para litos , 2 para valor");
				modo = teclado.nextInt();
				if(modo==1) {
					System.out.println("Quantos Litros?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo ==2) {
					System.out.println("Quantos Valor?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());					
				}
				else {
					System.out.println("Modo Invalido");
				}
			}
			else if(opcao==4) {
				System.out.println("1 para litos , 2 para valor");
				modo = teclado.nextInt();
				
				if(modo==1) {
					System.out.println("Quantos Litros?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo ==2) {
					System.out.println("Quantos Valor?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());					
				}
				else {
					System.out.println("Modo Invalido");
				}
			}
			else if(opcao==-1) {
				System.out.println("Volte sempre");
			}
			else {
				System.out.println("Opcao invalida");
			}
			
			
			/*
			switch(opcao) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("1 para litos , 2 para valor");
				modo = teclado.nextInt();
				if(modo==1) {
					System.out.println("Quantos Litros?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorLitros(valor);
					System.out.println(bombas[opcao].exibirRecibo());
				}
				else if (modo ==2) {
					System.out.println("Quantos Valor?");
					valor = teclado.nextDouble();
					bombas[opcao].abastecerPorValor(valor);
					System.out.println(bombas[opcao].exibirRecibo());					
				}
				else {
					System.out.println("Modo Invalido");
				}
			}*/
			
		}while(opcao!=-1);
		
	}
}
