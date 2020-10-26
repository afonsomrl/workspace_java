
public class Comparador {
	public static void main(String[] args) {
		
		//String s1 = "Oi tudo bem?";
		//String s2 = "Oi tudo bem?";
		
		String s1 = new String("Oi tudo bem?");
		String s2 = new String("Oi tudo bem?");
		
		if(s1 == s2){
			System.out.println("Apontam para objetos iguais");
		}
		else {
			System.out.println("Apontam para objetos diferentes");
		}
		
		if(s1.equals(s2)){
			System.out.println("Mesmo conteúdo");
		}
		else {
			System.out.println("Conteúdos distintos");
		}
		
	}
}
