package sistema;

import bd.BDMySQL;
import bd.BDOracle;
import bd.InterfaceBD;

public class SistemaPrincipal {
	public static void main(String[] args) {
		
		//InterfaceBD ibd = new BDMySQL();
		InterfaceBD ibd = new BDOracle();
		
		ibd.conectar("user","1234","ecommerce");
		ibd.executarComando("SELECT * from Tbl_Produtos");
		ibd.desconectar("ecommerce");
	}
}
