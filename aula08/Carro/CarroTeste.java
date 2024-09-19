package aula08.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		Motor mot = new Motor(200, 12f, 16);
		Cambio cambio = new Cambio("automatico", 6);
		Carro c1 = new Carro(2010, "cinza", mot, cambio);
		
		System.out.println("Carro do ano " + c1.getAno() + ", cor " + c1.getCor());
		System.out.println("Info do motor: " + 
				c1.getM1().getCavalos() + " cavalos" + 
				", consumo de " + c1.getM1().getConsumo() + "km/l" + 
				", nro de valvulas: " + c1.getM1().getNroValvulas());
	}
}
