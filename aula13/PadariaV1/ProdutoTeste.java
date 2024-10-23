package aula13.PadariaV1;

public class ProdutoTeste {

	public static void main(String[] args) {
		Pao prod1 = new Pao("Pao de forma", 5f, "SevenBoys", "Branco", 50f);
		// Pao prod2 = new Pao("Pao de forma", 10f, "SevenBoys", "Integral", 0f);
		Leite prod3 = new Leite("Leite de caixinha", 4.5f, "Elege","Integral", "C", 50f);
		Leite prod4 = new Leite("Leite de garrafa", 9.5f, "Elege","Integral", "A", 0f);
		Queijo prod5 = new Queijo("Queijo da serra", 50f, "President", "colonial", 50f);
		Queijo prod6 = new Queijo("Queijo embalado", 15f, "President", "mussarela", 0f);
		
//		System.out.println("Contem gluten: " + prod1.contemGlutem() + " - " + prod1);
//		prod1.setPercentualGluten(0f);
//		System.out.println("Contem gluten: " + prod1.contemGlutem() + " - " + prod1);
//		System.out.println("Contem lactose: " + prod3.contemLactose() + " - " + prod3);
//		System.out.println("Contem lactose: " + prod4.contemLactose() + " - " + prod4);
//		System.out.println("Contem lactose: " + prod5.contemLactose() + " - " + prod5);
//		System.out.println("Contem lactose: " + prod6.contemLactose() + " - " + prod6);
		
		Produto.mostrar(prod1);
		Produto.mostrar(prod3);
		Produto.mostrar(prod5);
		
	}

}
