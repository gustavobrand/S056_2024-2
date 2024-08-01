package aula01;

import java.util.Scanner;

public class teste01 {
// Exercicio: Leia e calcule a área de um quadrado e escreva na 
// tela. Para isso, leia o lado A e calcule a area fazendo A*A 
// e jogue na tela o resultado.
	public static void main(String[] args) {
		String texto = "Prof. Gustavo";
		int i = 5;
		System.out.print("Seu nome é " + texto + "\n");
		System.out.println("Seu nome é " + texto + ", numero " + i);
		System.out.printf("Seu nome é %s %d\n", texto, i);
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com um numero: ");
		int x = entrada.nextInt();
		System.out.println("O numero digitado foi " + x);
	}

}
