package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente Monteiro = new Cliente();
		Monteiro.setNome("Monteiro");

		Conta cc = new ContaCorrente(Monteiro);
		Conta poupanca = new ContaPoupanca(Monteiro);

		cc.depositar(350);
		cc.transferir(182, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
