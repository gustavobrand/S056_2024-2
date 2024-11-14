package aula16.ExemploClasseAbstrata;

public class Professor extends Funcionario {

	public Professor(String nome, float salario) {
		super(nome, salario);
	}

	@Override
	public void calcularSalario() {
		System.out.println("Salario do professor: R$" + (salario*1.15));
	}
	
}
