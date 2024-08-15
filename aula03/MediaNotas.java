package aula03;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com a nota 1: ");
		float n1 = entrada.nextFloat();
		System.out.print("Entre com a nota 2: ");
		float n2 = entrada.nextFloat();
		System.out.print("Entre com a nota 3: ");
		float n3 = entrada.nextFloat();
		
		float media = calculoMedia(n1, n2, n3);
		StatusAluno(media);
		System.out.printf("Nota final: %.2f", media);
	}
	
	public static float calculoMedia(float nota1, float nota2, float nota3) {
		return (nota1+nota2+nota3)/3f;
	}
	
	public static void StatusAluno(float media) {
		if (media >= 7f) {
			System.out.println("Aluno aprovado");
		} else if (media >= 5f) {
				System.out.println("Aluno em recuperacao");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
}
