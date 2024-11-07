package aula15.RPGIteracao1e2;

public class TesteRPG {

	public static void main(String[] args) {
		// TODO: esse é só um exemplo de iterações
		Personagem p1 = new Personagem(1000, 1, true);
		Personagem p2 = new Personagem(1000, 5, true);
		
		p1.atacar(p2, 50);
//		p1.atacar(p2, 1000);
		p2.atacar(p2, 100);
		p1.curar(p2, 10);
		p2.curar(p2, 10);
		
	}
}
