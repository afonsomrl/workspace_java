package bd;

public interface InterfaceBD {
	public void conectar(String usuario, String senha, String banco);
	public void desconectar(String banco);
	public void executarComando(String comando);
}
