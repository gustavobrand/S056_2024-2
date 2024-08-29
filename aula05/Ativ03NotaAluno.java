package aula05;

public class Ativ03NotaAluno {
	String nomeAluno;
	float nota1;
	float nota2;
	
	String mostraNomeAluno() {
		return nomeAluno;
	}
	void statusAluno() {
		// float media = (nota1+nota2)/2f;
		float media = mediaDoAluno();
		if (media >= 7f) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
	float mediaDoAluno() {
		return (nota1+nota2)/2f;
	}
}
