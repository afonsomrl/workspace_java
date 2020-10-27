package bd;

public class BDOracle implements InterfaceBD{

	@Override
	public void conectar(String usuario, String senha, String banco) {
		// TODO Auto-generated method stub
		System.out.println("Oracle engine connecting "+usuario+"@"+senha+"/"+banco);
	}

	@Override
	public void desconectar(String banco) {
		// TODO Auto-generated method stub
		System.out.println("Disconneting Oracle from "+banco);
	}

	@Override
	public void executarComando(String comando) {
		// TODO Auto-generated method stub
		System.out.println("Oracle: "+comando);
	}
	
}
