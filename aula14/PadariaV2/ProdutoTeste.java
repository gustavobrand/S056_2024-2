package aula14.PadariaV2;

public class ProdutoTeste {

	public static void main(String[] args) {
		Pao prod1 = new Pao("Pao de forma", 5f, "SevenBoys", "Branco", 50f);
		Pao prod2 = new Pao("Pao de forma", 10f, "SevenBoys", "Integral", 0f);
		Leite prod3 = new Leite("Leite de caixinha", 4.5f, "Elege","Integral", "C", 50f);
		Leite prod4 = new Leite("Leite de garrafa", 9.5f, "Elege","Integral", "A", 0f);
		Queijo prod5 = new Queijo("Queijo da serra", 50f, "President", "colonial", 50f);
		Queijo prod6 = new Queijo("Queijo embalado", 15f, "President", "mussarela", 0f);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.AdicionarItem(prod1);
		carrinho.AdicionarItem(prod2);
		carrinho.AdicionarItem(prod3);
		carrinho.AdicionarItem(prod4);
		carrinho.AdicionarItem(prod5);
		carrinho.AdicionarItem(prod6);
		carrinho.MostrarItens();
		System.out.println("Total das compras: R$" + carrinho.CalcularTotalDasCompras());
	}

}
