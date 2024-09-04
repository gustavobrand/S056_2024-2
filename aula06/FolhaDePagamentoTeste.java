package aula06;

public class FolhaDePagamentoTeste {

	public static void main(String[] args) {
		FolhaDePagamento folha = new FolhaDePagamento();
		System.out.println("Total da folha: R$" + folha.totalFolhaPagamento());
		
		folha.setNome1("Joao");
		folha.setSalario1(-1000f);
		folha.setNome2("Maria");
		folha.setSalario2(1200f);

		System.out.println("Nome: " + folha.getNome1() + 
				", Salario: R$" + folha.getSalario1());
		System.out.println("Nome: " + folha.getNome2() + 
				", Salario: R$" + folha.getSalario2());
		System.out.println("Total da folha: R$" + folha.totalFolhaPagamento());
	}
}
