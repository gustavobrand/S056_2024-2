package aula12.PessoaProfessorDiretor;

public class PessoaTeste {

	public static void main(String[] args) {
		Professor p1 = new Professor("Joao", 1000f);
		Diretor d1 = new Diretor("Maria", 1000f);
		
		System.out.println("Salario do professor: R$" + p1.getSalario());
		System.out.println("Salario do diretor: R$" + d1.getSalario());
		
		System.out.println(p1);
		System.out.println(d1);
	}
}
