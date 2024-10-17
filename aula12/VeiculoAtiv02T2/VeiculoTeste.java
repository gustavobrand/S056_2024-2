package aula12.VeiculoAtiv02T2;

public class VeiculoTeste {

	public static void main(String[] args) {
		Carro fusca = new Carro(30, "amarelo", "VW", "Fusca 1600", 2, false, 
				250, "Manual", false, 1600);
		
		Moto cg150 = new Moto(13, "vermelha", "Honda", "CG150", true, true, 
				"eletrica", "sentado", "city", 150);
		
		System.out.println(fusca);
		System.out.println(cg150);
	}
}
