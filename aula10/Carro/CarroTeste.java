package aula10.Carro;

import java.util.ArrayList;

public class CarroTeste {

	public static void main(String[] args) {
		Motor motor = new Motor(200, 12f, 16);
		Cambio cambio = new Cambio("automatico", 6);
		
		ArrayList<Pneu> pneus = new ArrayList<Pneu>();
		pneus.add(new Pneu(15, 240, 185, "dianteiro esquerdo"));
		pneus.add(new Pneu(15, 240, 185, "dianteiro direito"));
		pneus.add(new Pneu(15, 240, 205, "traseiro esquerdo"));
		pneus.add(new Pneu(15, 240, 205, "traseiro direito"));
		
		ArrayList<Banco> bancos = new ArrayList<Banco>();
		bancos.add(new Banco("cinza", "tecido", "motorista"));
		bancos.add(new Banco("cinza", "tecido", "carona"));
		bancos.add(new Banco("cinza", "tecido", "traseiro esquerdo"));
		bancos.add(new Banco("cinza", "tecido", "traseiro direito"));
		
		Carro carro = new Carro(2010, "cinza", motor, cambio, pneus, bancos);
		
		System.out.println(carro.getAno());
		System.out.println(carro.getCor());
		System.out.println(carro.getMotor());
		System.out.println(carro.getCambio());
		for (Pneu p : carro.getPneus()) {
			System.out.println(p);
		}
		for (Banco b : carro.getBancos()) {
			System.out.println(b);
		}
	}
}
