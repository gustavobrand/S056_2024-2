package aula14.RPGIteracao1;

public class TesteRPG {

	public static void main(String[] args) {
		// TODO: esse é só um exemplo de iterações
		// voces devem m
		Personagem p1 = new Personagem(1000, 1, true);
		Personagem p2 = new Personagem(1000, 10, true);
		
		p1.atacar(p2, 50);
		p2.atacar(p1, 100);
		p1.curar(p2, 10);
		p2.curar(p1, 10);
		
	}
}
