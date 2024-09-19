package aula08.MaeFilhos;

import java.util.ArrayList;

public class MaeTeste {

	public static void main(String[] args) {
//		Filho f1 = new Filho("Maria");
//		Filho f2 = new Filho("Joao");

		ArrayList<Filho> filhos = new ArrayList<Filho>();
		filhos.add(new Filho("Maria"));
		filhos.add(new Filho("Joao"));
		
//		Mae mae = new Mae("Julia", f1, f2);
		Mae mae = new Mae("Julia", filhos.get(0), filhos.get(1));		
//		System.out.println(mae);
		System.out.println(mae.getNomeMae());
		System.out.println(mae.getFilho1());
		System.out.println(mae.getFilho2());		
	}
}
