package aula12.PessoaProfessorDiretor;

public class Professor extends Pessoa {

	public Professor(String nome, float salario) {
		super(nome, salario);
	}
	
	public float getSalario() {
		float bonus = salario * (15f/100f);
		return salario + bonus;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", getSalario()=" + getSalario() + "]";
	}
	
}
