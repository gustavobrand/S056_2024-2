package aula04;

public class Produto {
	String nome;
	float preco;
	String descricao;

	String mostraNomeProduto() {
		return nome;
	}
	float mostraPreco() {
		return preco;
	}
	void mostraDescricaoProduto() {
		System.out.println(descricao);
	}
}
