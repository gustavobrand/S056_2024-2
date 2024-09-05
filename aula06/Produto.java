package aula06;

public class Produto {
	private String nome;
	private float preco;
	private String descricao;
	
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = "";
	}
	public Produto(String nome, float preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	public String mostraNomeProduto() {
		return nome;
	}
	public float mostraPreco() {
		return preco;
	}
	public void mostradescricaoProduto() {
		System.out.println(descricao);
	}
}
