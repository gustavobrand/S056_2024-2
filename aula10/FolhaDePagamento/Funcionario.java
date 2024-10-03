package aula10.FolhaDePagamento;

public class Funcionario {
	private float salario;
	private String nome;
	
	public Funcionario(float salario, String nome) {
		this.salario = salario;
		this.nome = nome;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", nome=" + nome + "]";
	}
}
