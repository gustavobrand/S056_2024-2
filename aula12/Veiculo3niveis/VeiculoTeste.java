package aula12.Veiculo3niveis;

public class VeiculoTeste {

	public static void main(String[] args) {
//		Carro fusca = new Carro(30, "amarelo", "VW", "Fusca 1600", 2, false, 
//				250, "Manual", false, 1600);
		
		Utilitario fuscao = new Utilitario(30, "amarelo", "VW", "Fusca 1600", 2, false, 
				250, "Manual", false, 1600, 5, false);
		
		Passeio fusquinha = new Passeio(30, "amarelo", "VW", "Fusca 1600", 2, false, 
				250, "Manual", false, 1600, true);
		
//		Moto cg150 = new Moto(13, "vermelha", "Honda", "CG150", true, true, 
//				"eletrica", "sentado", "city", 150);
		
		System.out.println(fuscao);
		System.out.println(fusquinha);
	}
}
