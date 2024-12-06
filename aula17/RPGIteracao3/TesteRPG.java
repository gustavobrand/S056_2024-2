package aula17.RPGIteracao3;

public class TesteRPG {

	public static void main(String[] args) {
		Cacador p1 = new Cacador(1000, 1, 10, 10);
		Lutador p2 = new Lutador(1000, 5, 20, 20);
		
		try {
//			// p1 é caçador
//			p1.atacar(p2, 50, 10);
//			p1.atacar(p2, 50, 30);
//			// p2 é lutador
//			p2.atacar(p1, 100, 1);
//			p2.atacar(p1, 100, 10);

			// p1 é caçador (20m)
			p1.mostraDistancia(p2);
			p1.atacar(p2, 50);
			p1.setXY(1, 1);
			p1.mostraDistancia(p2);
			p1.atacar(p2, 50);
			
			// p2 é lutador (2m)
			System.out.println();
			p2.mostraDistancia(p1);
			p2.atacar(p1, 100);
			p2.setXY(2, 2);
			p2.mostraDistancia(p1);
			p2.atacar(p1, 100);

		} catch (Exception e) {
			System.out.println("Deu problema");
			e.printStackTrace();
		}
	}
}
