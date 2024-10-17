package aula12.PessoaProfessorDiretor;

public class Diretor extends Pessoa {

	public Diretor(String nome, float salario) {
		super(nome, salario);
	}
	
	public float getSalario() {
		float bonus = salario*(20f/100f);
		return salario + bonus;
	}

	@Override
	public String toString() {
		return "Diretor [nome=" + nome + ", getSalario()=" + getSalario() + "]";
	}
	
}
