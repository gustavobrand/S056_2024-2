package aula07;

public class CarroTeste {

	public static void main(String[] args) {
		Motor mot = new Motor(200, 12f, 16);
		Carro c1 = new Carro(2010, "cinza", mot);
		
		System.out.println(c1.getAno());
		System.out.println(c1.getCor());
		System.out.println("Info do motor: ");
		System.out.println(c1.getM1().getCavalos());
		System.out.println(c1.getM1().getConsumo());
		System.out.println(c1.getM1().getNroValvulas());
	}
}
