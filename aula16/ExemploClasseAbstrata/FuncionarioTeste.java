package aula16.ExemploClasseAbstrata;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Professor p1 = new Professor("Joao", 1000);
		p1.calcularSalario();
		
		Diretor d1 = new Diretor("Maria", 1000);
		d1.calcularSalario();
	}

}
