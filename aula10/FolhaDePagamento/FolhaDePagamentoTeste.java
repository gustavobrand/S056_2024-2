package aula10.FolhaDePagamento;

public class FolhaDePagamentoTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(500f, "Joao");
		Funcionario f2 = new Funcionario(700f, "Maria");
		FolhaDePagamento folha = new FolhaDePagamento(f1, f2);
		
		System.out.println(folha.getFuncionario1());
		System.out.println(folha.getFuncionario2());
		folha.calcularFolhaPagamento();
	}
}
