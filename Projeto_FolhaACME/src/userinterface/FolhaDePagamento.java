package userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		ArrayList <Funcionario> funcionarios;
		
		funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(new Empreiteiro("Empreiteiro",1,1000));
		funcionarios.add(new Horista("Horista",2,15,160));
		funcionarios.add(new Comissionado("Comissionado",3,3000,10));
		funcionarios.add(new Chefe("Chefe",4,4000,20,400));
		System.out.printf(" REG  Nome                            Salario\n");
		for (Funcionario f:funcionarios) {
			System.out.printf("%5d %-30s R$ %8.2f\n",f.getNumRegistro(),f.getNome(),f.calcularSalario());
		}
	}
}
