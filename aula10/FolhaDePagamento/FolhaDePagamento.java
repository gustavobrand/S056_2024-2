package aula10.FolhaDePagamento;

public class FolhaDePagamento {
	private  Funcionario funcionario1;
	private  Funcionario funcionario2;
	
	public FolhaDePagamento(Funcionario funcionario1, Funcionario funcionario2) {
		this.funcionario1 = funcionario1;
		this.funcionario2 = funcionario2;
	}
	
	public void calcularFolhaPagamento() {
		float total = funcionario1.getSalario() + funcionario2.getSalario();
		System.out.println("Total da folha de pagamento: R$" + total);
	}
	
	public Funcionario getFuncionario1() {
		return funcionario1;
	}
	public void setFuncionario1(Funcionario funcionario1) {
		this.funcionario1 = funcionario1;
	}
	public Funcionario getFuncionario2() {
		return funcionario2;
	}
	public void setFuncionario2(Funcionario funcionario2) {
		this.funcionario2 = funcionario2;
	}
	
	@Override
	public String toString() {
		return "FolhaDePagamento [funcionario1=" + funcionario1 + ", funcionario2=" + funcionario2 + "]";
	}
}
