package aula16.ExemploClasseAbstrata;

public class Diretor extends Funcionario {

	public Diretor(String nome, float salario) {
		super(nome, salario);
	}
	
	public void calcularSalario() {
		System.out.println("Salario do diretor: R$" + (salario*1.2));
	}
	
}
