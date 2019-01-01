package entities;

public class Aluguel {
	
	private String nome;
	private String email;
	private int quarto;
	
	public Aluguel(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public Aluguel(String nome, String email) {
		this.nome = nome;
		this.email = email;
		}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "Nome: " 
				+ nome 
				+ ", Email:" 
				+ email;
	}
	
	
}
