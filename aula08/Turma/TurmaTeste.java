package aula08.Turma;

import java.util.ArrayList;

public class TurmaTeste {

	public static void main(String[] args) {		
		Aluno joao = new Aluno ("Joao", 6);
		Aluno maria = new Aluno("Maria", 8);
		
		Turma s056 = new Turma("S056 - POO", joao, maria);
		
		System.out.println(s056.getNomeTurma());
		System.out.println(s056.getAluno1().getNome());
		System.out.println(s056.getAluno1().getNota());
		
		// Agora usando os metodos toString das classes Aluno e Turma
		System.out.println(s056.getAluno2());
		System.out.println(s056);
	}
}
