
public class Main {

	public static void main(String[] args) {
		
		Cliente yuan = new Cliente();
		yuan.setNome("yuan");
		
		
		Conta cc = new ContaCorrente(yuan);
		cc.depositar(100);
		
		Conta cp = new ContaPoupança(yuan);
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
