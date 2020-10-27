package bd;

public class BDMySQL implements InterfaceBD{

	@Override
	public void conectar(String usuario, String senha, String banco) {
		// TODO Auto-generated method stub
		System.out.println("Database "+banco+"connected by "+usuario+"@"+senha);
	}

	@Override
	public void desconectar(String banco) {
		// TODO Auto-generated method stub
		System.out.println("Disconneting from "+banco);
	}

	@Override
	public void executarComando(String comando) {
		// TODO Auto-generated method stub
		System.out.println("MySQL: "+comando);
	}
	
}
