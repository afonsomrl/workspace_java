import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("óia que legal! Digite algo");
		int valor = teclado.nextInt();
		System.out.println("Valor = "+valor);
		teclado.close();
	}
}
