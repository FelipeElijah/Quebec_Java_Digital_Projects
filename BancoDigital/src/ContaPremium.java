
public class ContaPremium extends Conta{

	public ContaPremium(Cliente cliente) {
		super(cliente);
	};
	
	@Override
	public void transferencia(double valor, Cliente cliente){
		if(this.saldo> valor) {
			this.saldo -= valor;
			imprimirInfosComuns();
		}else {
			System.out.println("Erro ao tentar Transferir o dinheiro");
		};
	};
	
	@Override
	public void sacar(double valor) {
		if(this.saldo> valor) {
			this.saldo -= valor;
			imprimirInfosComuns();
		}else {
			System.out.println("Erro ao tentar Transferir o dinheiro");
		};
	};
}
