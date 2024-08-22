package aula04;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Maça";
		p1.preco = 1.5f;
		p1.descricao = "Maça Fuji";
		System.out.println("Nome: " + p1.mostraNomeProduto() + 
				", preço: R$" + p1.mostraPreco());
		p1.mostraDescricaoProduto();
		
		Produto p2 = new Produto();
		p2.nome = "Banana";
		p2.preco = 5f;
		p2.descricao = "Banana Caturra";
		System.out.println(p2.mostraNomeProduto());
		System.out.println(p2.mostraPreco());
		p2.mostraDescricaoProduto();
	}

}
