package aula05;

import java.util.Scanner;

public class Ativ03NotaAlunoTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
 		Ativ03NotaAluno aluno1 = new Ativ03NotaAluno();

// 		Entrada fixa
//		aluno1.nomeAluno = "Joao"; 
//		aluno1.nota1 = 7f;
//		aluno1.nota2 = 8f;
 		
// 		Entrada via teclado
 		System.out.print("Nome do aluno: ");
		aluno1.nomeAluno = entrada.next();
 		System.out.print("Nota 1 do aluno: ");
		aluno1.nota1 = entrada.nextFloat();
 		System.out.print("Nota 2 do aluno: ");
		aluno1.nota2 = entrada.nextFloat();
		
		Ativ03NotaAluno aluno2 = new Ativ03NotaAluno();
		aluno2.nomeAluno = "Maria"; 
		aluno2.nota1 = 7f;
		aluno2.nota2 = 7f;
		
		System.out.println("Aluno " + aluno1.mostraNomeAluno() + 
				" ficou com média " + aluno1.mediaDoAluno());
		aluno1.statusAluno();
		
		System.out.println("Aluno " + aluno2.mostraNomeAluno() + 
				" ficou com média " + aluno2.mediaDoAluno());
		aluno2.statusAluno();
	}
}
