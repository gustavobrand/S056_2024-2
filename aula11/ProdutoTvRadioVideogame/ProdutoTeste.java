package aula11.ProdutoTvRadioVideogame;

public class ProdutoTeste {

	public static void main(String[] args) {
		Tv televisao = new Tv("Tv da sala", 2000, "LG", 50, "QLED");
		Radio radinho = new Radio("Radinho de pilha", 30, "Sony", 5);
		Videogame xbox = new Videogame("SeriesX", 4000, "Microsoft", 4);
		
		System.out.println(televisao);
		System.out.println(radinho);
		System.out.println(xbox);
	}
}
