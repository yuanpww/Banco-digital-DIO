
public class ContaPoupança extends Conta {

	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato( ) {
		
		System.out.println("=== extrato conta poupança ===");
		super.imprimirInfosComuns();
	}
	
}
	
