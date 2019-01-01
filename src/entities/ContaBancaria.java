package entities;

public class ContaBancaria {
	private String cliente;
	private String conta;
	private static double saldo = 0;

	public ContaBancaria(String cliente, String conta, double depositoInicial) {
		super();
		this.cliente = cliente;
		this.conta = conta;
		deposito(depositoInicial);
	}

	public ContaBancaria(String cliente, String conta) {
		super();
		this.cliente = cliente;
		this.conta = conta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public static void deposito(double valor) {
		saldo += valor;
	}

	public static void saque(double valor) {
		saldo -= valor + 5.0;
	}

	@Override
	public String toString() {
		return "Cliente: " 
			+ cliente 
			+ ", Conta: " 
			+ conta 
			+ ", Saldo: " 
			+ String.format("%.2f", saldo);
	}

}
