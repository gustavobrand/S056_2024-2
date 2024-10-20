package aula12.PessoaProfessorDiretor;

public class Pessoa {
	protected String nome;
	protected float salario;
	
	public Pessoa(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", salario=" + salario + "]";
	}
}
