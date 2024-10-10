package aula11.CarroAtiv01T2;

public class CarroTeste {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.montaCarro("Fusca", 1600);
		System.out.println(fusca);
		fusca.montaCarro("Fusquinha", "VW");
		System.out.println(fusca);
		fusca.montaCarro("Fuscao", "Volkswagen", 1500);
		System.out.println(fusca);
	}
}
