package aula08.ArrayLists;

import java.util.ArrayList;

public class Exemplo1 {

	public static void main(String[] args) {
		ArrayList<Integer> listaDeInteiros = new ArrayList<Integer>();
		listaDeInteiros.add(4);
		listaDeInteiros.add(7);
		listaDeInteiros.add(9);
		
		for (Integer i : listaDeInteiros) {
			System.out.print(i + " ");
		}
		System.out.println();
		ArrayList<Float> listaDeFloats = new ArrayList<Float>();
		listaDeFloats.add(5.4f);
		listaDeFloats.add(6f);
		listaDeFloats.add(53.33f);
		for (Float i : listaDeFloats) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i=0; i < listaDeFloats.size(); i++) {
			System.out.print(listaDeFloats.get(i) + " ");
		}

		System.out.println();
		Aluno a1 = new Aluno("Maria", 8);
		ArrayList<Aluno> turma = new ArrayList<Aluno>();
		turma.add(a1);
		turma.add(new Aluno("Joao", 6));
		turma.add(new Aluno("Gilberto", 7));
		for (Aluno i : turma) {
			System.out.println(i);
		}
		
		
	}

}
