
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*
		 * int valor1, valor2, res;
		 * 
		 * try { System.out.println("Digite um valor"); valor1= teclado.nextInt();
		 * System.out.println("Digite um valor"); valor2= teclado.nextInt(); res =
		 * valor1/valor2; System.out.println("Resultado da divisao = "+res);
		 * teclado.close(); } catch (InputMismatchException e) {
		 * System.out.println("Digite um valor inteiro"); } catch(ArithmeticException e)
		 * { System.out.println("Erro na divisao, não pode ser dividido por 0"); }
		 * catch(Exception e) { System.out.println("Deu ruim");
		 * System.out.println("tipo da Excecao:"+e.getClass().getName()); }
		 */

		int id;
		String desc;
		double preco;
		int opcao = 1;

		do {

			try {
				Produto p = new Produto();
				System.out.println("Digite ID");
				id = Integer.parseInt(teclado.nextLine());
				p.setId(id);

				System.out.println("Digite a Descricao");
				desc = teclado.nextLine();
				p.setDescricao(desc);

				System.out.println("Digite o Preco");
				preco = Double.parseDouble(teclado.nextLine());
				p.setPreco(preco);

				System.out.println("Produto cadastrado" + p);
				
				System.out.println("Deseja continuar ? 0-nao /1-sim");
				opcao= Integer.parseInt(teclado.nextLine());
				
			} catch (NumberFormatException e) {
				System.out.println("Valor Digitado Errado");
			} catch (InputMismatchException e) {
				System.out.println("Esperado valor numerico");
			} catch (Exception e) {
				System.out.println("ERRO " + e.getMessage());
			}
		} while (opcao != 0);
	}
}
