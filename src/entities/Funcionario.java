package entities;

public class Funcionario {
	public String nome;
	public double salBruto;
	public double imposto;
	public String nono;
	
	public void salAumentado(double percent) {
		salBruto += salBruto * percent/100.0;
	}
	public double salLiq() {
		return salBruto - imposto;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salLiq());
		
	}
	
}
