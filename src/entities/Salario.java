package entities;

public class Salario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Salario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void reajuste(double percent) {
		salario += salario*percent/100;
	}
	

	@Override
	public String toString() {
		return "Id: " + id 
				+ ", Nome: " + nome 
				+ ", Salário: " + String.format("%.2f", salario);
	}	
	
	

}
