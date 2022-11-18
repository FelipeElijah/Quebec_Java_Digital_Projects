import java.util.*;

public abstract class Conta implements MetodosConta {
	
	private static final int AGENCIAPADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected double saldo;
	protected int agencia;
	protected int numero;
	protected Cliente cliente;
	
	public double getSaldo() {
		return saldo;
	};

	public int getAgencia() {
		return agencia;
	};

	public int getNumero() {
		return numero;
	};
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIAPADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	};
	
	protected void imprimirInfosComuns() {
		
		List <String> comprovantes = new ArrayList<String>();
		String nome = String.format("Titular: %s", this.cliente.getNome());
		String agencia = String.format("Agencia: %d", this.agencia);
		String numero = String.format("Numero: %d", this.numero);
		String saldo = String.format("Saldo: %.2f", this.saldo);
		comprovantes.add(nome);
		comprovantes.add(agencia);
		comprovantes.add(numero);
		comprovantes.add(saldo);
		
		System.out.println(comprovantes.toString());
	};
	
	@Override
	public void transferencia(double valor, Cliente cliente){
		double tarifa = valor*0.01;
		if(this.saldo> valor) {
			this.saldo -= valor + tarifa;
			imprimirInfosComuns();
		}else {
			System.out.println("Erro ao tentar Transferir o dinheiro");
		};
	};
	
	@Override
	public void sacar(double valor) {
		double tarifa = valor*0.02;
		if(this.saldo> valor) {
			this.saldo -= valor + tarifa;
			imprimirInfosComuns();
		}else {
			System.out.println("Erro ao tentar Transferir o dinheiro");
		};
	};
	
	@Override
	 public void depositar(double valor) {
		this.saldo += valor;
		imprimirInfosComuns();
	};
}
