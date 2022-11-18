
public class Main {
	public static void main (String [] args) {
		Cliente Felipe = new Cliente();
		Cliente Joao = new Cliente();
		Felipe.setNome("Felipe");
		Joao.setNome("Joao");
		
		ContaPoupanca cpa = new ContaPoupanca(Joao);
		ContaCorrente cc = new ContaCorrente(Joao);
		ContaPremium cpr = new ContaPremium(Felipe);
		cpr.depositar(100);
		cpa.depositar(100);
		cc.depositar(100);
		
		cpr.transferencia( 50.00, Joao);
		cpa.transferencia( 50.00, Felipe);
		cc.transferencia( 50.00, Joao);
		cpr.sacar(10);
		cpa.sacar(10);
		cc.sacar(10);
	}
}
