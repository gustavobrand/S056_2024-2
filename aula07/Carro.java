package aula07;

public class Carro {
	private int ano;
	private String cor;
	private Motor m1;
	
	public Carro() {}
	public Carro(int ano, String cor, Motor m1) {
		this.ano = ano;
		this.cor = cor;
		this.m1 = m1;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Motor getM1() {
		return m1;
	}
	public void setM1(Motor m1) {
		this.m1 = m1;
	}
}
