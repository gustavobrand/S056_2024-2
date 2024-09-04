package aula06;

public class FolhaDePagamento {
	private String nome1;
	private Float salario1 = 0f;
	private String nome2;
	private Float salario2 = 0f;
	
	public float totalFolhaPagamento() {
		return (salario1 + salario2);
	}	
	public String getNome1() {
		return nome1;
	}
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	public Float getSalario1() {
		return salario1;
	}
	public void setSalario1(Float salario1) {
		if (salario1 > 0) {
			this.salario1 = salario1;
		}
	}
	public String getNome2() {
		return nome2;
	}
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	public Float getSalario2() {
		return salario2;
	}
	public void setSalario2(Float salario2) {
		if (salario2 > 0) {
			this.salario2 = salario2;
		}
	}
	
}
