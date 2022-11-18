
public class ContaPoupanca extends Conta{
	public ContaPoupanca(Cliente cliente){
		super(cliente);
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
