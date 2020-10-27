
public class NucleoImportacao implements InterfaceOracle,InterfaceMicrosoft{
	public void importarInvoice(String conteudoDaInvoice) {
		System.out.println("Importar conteudo: "+conteudoDaInvoice);
	}

	
	@Override
	public void extractInvoiceInformation(String invoice) {
		// TODO Auto-generated method stub
		importarInvoice(invoice);
	}


	@Override
	public void getInvoiceDataAndImport(String invoice) {
		// TODO Auto-generated method stub
		importarInvoice(invoice);
	}
	
}
